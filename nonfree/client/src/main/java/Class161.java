import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public abstract class Class161 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!lr;")
	private Class2_Sub20_Sub3 aClass2_Sub20_Sub3_2;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!ff;")
	private Class2_Sub20_Sub1 aClass2_Sub20_Sub1_2;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "Z")
	private boolean aBoolean328;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
	private boolean aBoolean329;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Lclient!kh;")
	private Class2_Sub20_Sub2 aClass2_Sub20_Sub2_2;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "Z")
	private boolean aBoolean330;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[B")
	private final byte[] aByteArray41;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!tba;")
	private final Class323 aClass323_17;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	protected Class161(@OriginalArg(0) int arg0) {
		if (!Static354.method5314("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray41 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass323_17 = new Class323(8);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lclient!ff;")
	public final Class2_Sub20_Sub1 method3852() {
		return this.aClass2_Sub20_Sub1_2;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lclient!kh;")
	public final Class2_Sub20_Sub2 method3854() {
		return this.aClass2_Sub20_Sub2_2;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Z")
	public final boolean method3855() {
		if (this.aBoolean328 || this.aBoolean329) {
			return this.aClass2_Sub20_Sub3_2 == null || this.aClass2_Sub20_Sub3_2.method5081() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
	public final void method3856(@OriginalArg(1) boolean arg0) {
		if (this.aClass2_Sub20_Sub3_2 != null) {
			@Pc(11) Class2_Sub11_Sub3 local11 = this.aClass2_Sub20_Sub3_2.method5079();
			if (local11 != null) {
				local11.method3285(arg0);
			}
		}
		this.aBoolean330 = !this.aBoolean330;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)D")
	public final double method3857() {
		if (this.aClass2_Sub20_Sub3_2 == null) {
			return this.aClass2_Sub20_Sub1_2 == null ? 0.0D : this.aClass2_Sub20_Sub1_2.method2723();
		} else {
			return this.aClass2_Sub20_Sub3_2.method5084();
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	private void method3858() {
		for (@Pc(11) Class2_Sub20 local11 = (Class2_Sub20) this.aClass323_17.method7480(); local11 != null; local11 = (Class2_Sub20) this.aClass323_17.method7482()) {
			if (this.aClass2_Sub20_Sub1_2 != local11) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method7362(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub20_Sub1_2 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < 10; local53++) {
			if (!this.method3860()) {
				return;
			}
			if (this.aClass2_Sub20_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method3862();
				return;
			}
			this.aClass2_Sub20_Sub1_2.method7362(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)Lclient!rc;")
	private Class2_Sub20 method3859() throws IOException {
		if (this.aBoolean328) {
			throw new IllegalStateException();
		} else if (this.aBoolean329) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method3867(this.aByteArray41);
				if (local23 == -1) {
					this.aBoolean329 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray41, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(209) Class2_Sub20 local209 = (Class2_Sub20) this.aClass323_17.method7484((long) local23);
				if (!local209.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local209;
			}
			@Pc(78) OggStreamState local78 = new OggStreamState(local23);
			if (!local78.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local78.packetPeek(this.anOggPacket2) == 1) {
				@Pc(115) Class2_Sub20 local115;
				if (this.aClass2_Sub20_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub20_Sub1_2 = new Class2_Sub20_Sub1(local78);
					local115 = this.aClass2_Sub20_Sub1_2;
				} else if (this.aClass2_Sub20_Sub3_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub20_Sub3_2 = new Class2_Sub20_Sub3(local78);
					local115 = this.aClass2_Sub20_Sub3_2;
				} else {
					@Pc(128) byte[] local128 = this.anOggPacket2.getData();
					@Pc(132) StringBuffer local132 = new StringBuffer();
					for (@Pc(134) int local134 = 1; local134 < local128.length && Character.isLetterOrDigit((char) local128[local134]); local134++) {
						local132.append((char) local128[local134]);
					}
					@Pc(161) String local161 = local132.toString();
					if (local161.equals("kate")) {
						local115 = new Class2_Sub20_Sub2(local78);
					} else {
						local115 = new Class2_Sub20_Sub4(local78);
					}
				}
				this.aClass323_17.method7477(local115, (long) local23);
				return local115;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)Z")
	private boolean method3860() {
		if (this.aClass2_Sub20_Sub3_2 == null) {
			@Pc(38) double local38 = (double) this.aClass2_Sub20_Sub1_2.method2719();
			return local38 == 0.0D || (double) Static48.method1203() >= 1000.0D / local38 + (double) this.aClass2_Sub20_Sub1_2.method2720();
		} else {
			return !this.aClass2_Sub20_Sub1_2.method2722() || this.method3857() > this.aClass2_Sub20_Sub1_2.method2723();
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Lclient!lr;")
	public final Class2_Sub20_Sub3 method3861() {
		return this.aClass2_Sub20_Sub3_2;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
	public final void method3862() {
		if (this.aBoolean328) {
			return;
		}
		for (@Pc(19) Class2_Sub20 local19 = (Class2_Sub20) this.aClass323_17.method7480(); local19 != null; local19 = (Class2_Sub20) this.aClass323_17.method7482()) {
			local19.method7360();
			local19.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	public final void method3863() throws IOException {
		if (this.aBoolean330) {
			return;
		}
		while (!this.aBoolean328) {
			@Pc(28) Class2_Sub20 local28;
			if (this.aBoolean327) {
				local28 = (Class2_Sub20) this.aClass323_17.method7484((long) this.anOggPage2.getSerialNumber());
			} else {
				local28 = this.method3859();
				if (local28 == null) {
					if (this.aBoolean329) {
						this.method3858();
					}
					return;
				}
				if (local28 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean327 = true;
			}
			if (this.aClass2_Sub20_Sub3_2 == local28) {
				if (this.aClass2_Sub20_Sub3_2.method5081() >= 50) {
					return;
				}
				while (this.aClass2_Sub20_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub20_Sub3_2.method7362(this.anOggPacket2);
					this.method3864();
					if (this.aClass2_Sub20_Sub1_2 != null) {
						@Pc(150) double local150 = this.aClass2_Sub20_Sub1_2.method2723();
						for (@Pc(152) int local152 = 0; local152 < 10 && this.method3860(); local152++) {
							this.method3865();
							if (this.aBoolean328) {
								return;
							}
						}
						if (this.aClass2_Sub20_Sub1_2.method2723() > local150) {
							return;
						}
					}
					if (this.aClass2_Sub20_Sub3_2.method5081() >= 50) {
						return;
					}
				}
			} else if (local28 instanceof Class2_Sub20_Sub2) {
				this.method3864();
			} else if (this.aClass2_Sub20_Sub1_2 != local28) {
				while (local28.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local28.anInt8543 == 1 && local28 instanceof Class2_Sub20_Sub2) {
						this.method3866(this.aString41);
					}
					local28.method7362(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub20_Sub3_2 == null && !this.aBoolean330) {
				for (@Pc(71) int local71 = 0; local71 < 10 && this.method3860(); local71++) {
					this.method3865();
					if (this.aBoolean328) {
						return;
					}
				}
				return;
			}
			this.aBoolean327 = false;
		}
	}

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V")
	private void method3864() {
		for (@Pc(7) Class2_Sub20 local7 = (Class2_Sub20) this.aClass323_17.method7480(); local7 != null; local7 = (Class2_Sub20) this.aClass323_17.method7482()) {
			if (local7 instanceof Class2_Sub20_Sub2) {
				@Pc(15) Class2_Sub20_Sub2 local15 = (Class2_Sub20_Sub2) local7;
				while ((local15.anInt8543 <= 8 || this.method3857() > (double) local15.method4651()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method7362(this.anOggPacket2);
				}
			}
		}
		this.method3866(this.aString41);
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(I)V")
	private void method3865() throws IOException {
		while (this.aClass2_Sub20_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(18) Class2_Sub20 local18 = this.method3859();
			if (local18 == null) {
				if (this.aBoolean329) {
					this.method3858();
				}
				return;
			}
			if (this.aClass2_Sub20_Sub2_2 == local18) {
				this.method3864();
			}
		}
		this.aClass2_Sub20_Sub1_2.method7362(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3866(@OriginalArg(1) String arg0) {
		this.aString41 = arg0;
		if (this.aString41 == null) {
			this.aClass2_Sub20_Sub2_2 = null;
			return;
		}
		if (this.aClass2_Sub20_Sub2_2 != null && !this.aString41.equals(this.aClass2_Sub20_Sub2_2.method4652())) {
			this.aClass2_Sub20_Sub2_2 = null;
		}
		if (this.aClass2_Sub20_Sub2_2 != null) {
			return;
		}
		for (@Pc(40) Class2_Sub20 local40 = (Class2_Sub20) this.aClass323_17.method7480(); local40 != null; local40 = (Class2_Sub20) this.aClass323_17.method7482()) {
			if (local40 instanceof Class2_Sub20_Sub2) {
				@Pc(47) Class2_Sub20_Sub2 local47 = (Class2_Sub20_Sub2) local40;
				if (this.aString41.equals(local47.method4652())) {
					this.aClass2_Sub20_Sub2_2 = local47;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)I")
	protected abstract int method3867(@OriginalArg(0) byte[] arg0) throws IOException;
}
