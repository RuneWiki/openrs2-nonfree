import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public abstract class Class78 {

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "Lclient!aw;")
	private Class3_Sub8_Sub1 aClass3_Sub8_Sub1_2;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "Lclient!vs;")
	private Class3_Sub8_Sub4 aClass3_Sub8_Sub4_2;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "Lclient!tb;")
	private Class3_Sub8_Sub3 aClass3_Sub8_Sub3_2;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "[B")
	private final byte[] aByteArray12;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private OggPacket anOggPacket2;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!gn;")
	private final Class136 aClass136_14;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
	protected Class78(@OriginalArg(0) int arg0) {
		if (!Static376.method5425("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray12 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass136_14 = new Class136(8);
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)Lclient!jw;")
	private Class3_Sub8 method2093() throws IOException {
		if (this.aBoolean195) {
			throw new IllegalStateException();
		} else if (this.aBoolean196) {
			return null;
		} else {
			@Pc(35) int local35;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local35 = this.method2103(this.aByteArray12);
				if (local35 == -1) {
					this.aBoolean196 = true;
					return null;
				}
				if (local35 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray12, local35)) {
					throw new RuntimeException("");
				}
			}
			local35 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(227) Class3_Sub8 local227 = (Class3_Sub8) this.aClass136_14.method3503((long) local35);
				if (!local227.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local227;
			}
			@Pc(88) OggStreamState local88 = new OggStreamState(local35);
			if (!local88.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local88.packetPeek(this.anOggPacket2) == 1) {
				@Pc(181) Class3_Sub8 local181;
				if (this.aClass3_Sub8_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub8_Sub4_2 = new Class3_Sub8_Sub4(local88);
					local181 = this.aClass3_Sub8_Sub4_2;
				} else if (this.aClass3_Sub8_Sub3_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub8_Sub3_2 = new Class3_Sub8_Sub3(local88);
					local181 = this.aClass3_Sub8_Sub3_2;
				} else {
					@Pc(133) byte[] local133 = this.anOggPacket2.getData();
					@Pc(137) StringBuffer local137 = new StringBuffer();
					for (@Pc(139) int local139 = 1; local133.length > local139 && Character.isLetterOrDigit((char) local133[local139]); local139++) {
						local137.append((char) local133[local139]);
					}
					@Pc(168) String local168 = local137.toString();
					if (local168.equals("kate")) {
						local181 = new Class3_Sub8_Sub1(local88);
					} else {
						local181 = new Class3_Sub8_Sub2(local88);
					}
				}
				this.aClass136_14.method3508((long) local35, local181);
				return local181;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Lclient!vs;")
	public final Class3_Sub8_Sub4 method2094() {
		return this.aClass3_Sub8_Sub4_2;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Z")
	private boolean method2095() {
		if (this.aClass3_Sub8_Sub3_2 == null) {
			@Pc(43) double local43 = (double) this.aClass3_Sub8_Sub4_2.method9118();
			return local43 == 0.0D || (double) Static626.method8479() >= (double) this.aClass3_Sub8_Sub4_2.method9115() + 1000.0D / local43;
		} else {
			return !this.aClass3_Sub8_Sub4_2.method9119() || this.method2107() > this.aClass3_Sub8_Sub4_2.method9123();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	private void method2097() throws IOException {
		while (this.aClass3_Sub8_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(21) Class3_Sub8 local21 = this.method2093();
			if (local21 == null) {
				if (this.aBoolean196) {
					this.method2101();
				}
				return;
			}
			if (this.aClass3_Sub8_Sub1_2 == local21) {
				this.method2099();
			}
		}
		this.aClass3_Sub8_Sub4_2.method9109(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
	public final void method2098() throws IOException {
		if (this.aBoolean198) {
			return;
		}
		while (!this.aBoolean195) {
			@Pc(23) Class3_Sub8 local23;
			if (this.aBoolean197) {
				local23 = (Class3_Sub8) this.aClass136_14.method3503((long) this.anOggPage2.getSerialNumber());
			} else {
				local23 = this.method2093();
				if (local23 == null) {
					if (this.aBoolean196) {
						this.method2101();
					}
					return;
				}
				if (local23 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean197 = true;
			}
			if (local23 == this.aClass3_Sub8_Sub3_2) {
				if (this.aClass3_Sub8_Sub3_2.method8285() >= 50) {
					return;
				}
				while (this.aClass3_Sub8_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub8_Sub3_2.method9109(this.anOggPacket2);
					this.method2099();
					if (this.aClass3_Sub8_Sub4_2 != null) {
						@Pc(83) double local83 = this.aClass3_Sub8_Sub4_2.method9123();
						for (@Pc(85) int local85 = 0; local85 < 10 && this.method2095(); local85++) {
							this.method2097();
							if (this.aBoolean195) {
								return;
							}
						}
						if (this.aClass3_Sub8_Sub4_2.method9123() > local83) {
							return;
						}
					}
					if (this.aClass3_Sub8_Sub3_2.method8285() >= 50) {
						return;
					}
				}
			} else if (local23 instanceof Class3_Sub8_Sub1) {
				this.method2099();
			} else if (local23 != this.aClass3_Sub8_Sub4_2) {
				while (local23.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local23.anInt10908 == 1 && local23 instanceof Class3_Sub8_Sub1) {
						this.method2100(this.aString36);
					}
					local23.method9109(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub8_Sub3_2 == null && !this.aBoolean198) {
				for (@Pc(218) int local218 = 0; local218 < 10 && this.method2095(); local218++) {
					this.method2097();
					if (this.aBoolean195) {
						return;
					}
				}
				return;
			}
			this.aBoolean197 = false;
		}
		if (-51 != -51) {
			Static459.method2096(53, -27, -79, 102);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	private void method2099() {
		for (@Pc(7) Class3_Sub8 local7 = (Class3_Sub8) this.aClass136_14.method3509(); local7 != null; local7 = (Class3_Sub8) this.aClass136_14.method3506()) {
			if (local7 instanceof Class3_Sub8_Sub1) {
				@Pc(17) Class3_Sub8_Sub1 local17 = (Class3_Sub8_Sub1) local7;
				while ((local17.anInt10908 <= 8 || this.method2107() > (double) local17.method502()) && local17.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local17.method9109(this.anOggPacket2);
				}
			}
		}
		this.method2100(this.aString36);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method2100(@OriginalArg(0) String arg0) {
		this.aString36 = arg0;
		if (this.aString36 == null) {
			this.aClass3_Sub8_Sub1_2 = null;
			return;
		}
		if (this.aClass3_Sub8_Sub1_2 != null && !this.aString36.equals(this.aClass3_Sub8_Sub1_2.method505())) {
			this.aClass3_Sub8_Sub1_2 = null;
		}
		if (this.aClass3_Sub8_Sub1_2 != null) {
			return;
		}
		for (@Pc(48) Class3_Sub8 local48 = (Class3_Sub8) this.aClass136_14.method3509(); local48 != null; local48 = (Class3_Sub8) this.aClass136_14.method3506()) {
			if (local48 instanceof Class3_Sub8_Sub1) {
				@Pc(58) Class3_Sub8_Sub1 local58 = (Class3_Sub8_Sub1) local48;
				if (this.aString36.equals(local58.method505())) {
					this.aClass3_Sub8_Sub1_2 = local58;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	private void method2101() {
		for (@Pc(7) Class3_Sub8 local7 = (Class3_Sub8) this.aClass136_14.method3509(); local7 != null; local7 = (Class3_Sub8) this.aClass136_14.method3506()) {
			if (this.aClass3_Sub8_Sub4_2 != local7) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method9109(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub8_Sub4_2 == null) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
			if (!this.method2095()) {
				return;
			}
			if (this.aClass3_Sub8_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method2102();
				return;
			}
			this.aClass3_Sub8_Sub4_2.method9109(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	public final void method2102() {
		if (this.aBoolean195) {
			return;
		}
		for (@Pc(16) Class3_Sub8 local16 = (Class3_Sub8) this.aClass136_14.method3509(); local16 != null; local16 = (Class3_Sub8) this.aClass136_14.method3506()) {
			local16.method9114();
			local16.anOggStreamState5.b();
		}
		if (18389 != 18389) {
			this.anOggPacket2 = null;
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean195 = true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([BI)I")
	protected abstract int method2103(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Lclient!aw;")
	public final Class3_Sub8_Sub1 method2104() {
		return this.aClass3_Sub8_Sub1_2;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZB)V")
	public final void method2105(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub8_Sub3_2 != null) {
			@Pc(13) Class3_Sub22_Sub3 local13 = this.aClass3_Sub8_Sub3_2.method8287();
			if (local13 != null) {
				local13.method7187(arg0);
			}
		}
		this.aBoolean198 = !this.aBoolean198;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Lclient!tb;")
	public final Class3_Sub8_Sub3 method2106() {
		return this.aClass3_Sub8_Sub3_2;
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)D")
	public final double method2107() {
		if (this.aClass3_Sub8_Sub3_2 == null) {
			return this.aClass3_Sub8_Sub4_2 == null ? 0.0D : this.aClass3_Sub8_Sub4_2.method9123();
		} else {
			return this.aClass3_Sub8_Sub3_2.method8289();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)Z")
	public final boolean method2108() {
		if (this.aBoolean195 || this.aBoolean196) {
			return this.aClass3_Sub8_Sub3_2 == null || this.aClass3_Sub8_Sub3_2.method8285() <= 0;
		} else {
			return false;
		}
	}
}
