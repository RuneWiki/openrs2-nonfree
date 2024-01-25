import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public abstract class Class133 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "Z")
	private boolean aBoolean271;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "Lclient!lr;")
	private Class3_Sub5_Sub3 aClass3_Sub5_Sub3_2;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "Lclient!bd;")
	private Class3_Sub5_Sub1 aClass3_Sub5_Sub1_2;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "Lclient!dfa;")
	private Class3_Sub5_Sub2 aClass3_Sub5_Sub2_2;

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "Lclient!cja;")
	private final Class62 aClass62_18;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
	protected Class133(@OriginalArg(0) int arg0) {
		if (!Static519.method7352("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray25 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass62_18 = new Class62(8);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	private void method2956() {
		for (@Pc(9) Class3_Sub5 local9 = (Class3_Sub5) this.aClass62_18.method1680(); local9 != null; local9 = (Class3_Sub5) this.aClass62_18.method1681()) {
			if (this.aClass3_Sub5_Sub1_2 != local9) {
				while (local9.anOggStreamState5.packetOut() == 1) {
					local9.method7530(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub5_Sub1_2 == null) {
			return;
		}
		for (@Pc(45) int local45 = 0; local45 < 10 && this.method2957(); local45++) {
			if (this.aClass3_Sub5_Sub1_2.anOggStreamState5.packetOut() != 1) {
				this.method2963();
				return;
			}
			this.aClass3_Sub5_Sub1_2.method7530(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Z")
	private boolean method2957() {
		if (this.aClass3_Sub5_Sub3_2 == null) {
			@Pc(17) double local17 = (double) this.aClass3_Sub5_Sub1_2.method1141();
			return local17 == 0.0D || (double) Static131.method2268() >= 1000.0D / local17 + (double) this.aClass3_Sub5_Sub1_2.method1142();
		} else {
			return !this.aClass3_Sub5_Sub1_2.method1145() || this.method2960() > this.aClass3_Sub5_Sub1_2.method1146();
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	private void method2958() {
		for (@Pc(13) Class3_Sub5 local13 = (Class3_Sub5) this.aClass62_18.method1680(); local13 != null; local13 = (Class3_Sub5) this.aClass62_18.method1681()) {
			if (local13 instanceof Class3_Sub5_Sub2) {
				@Pc(21) Class3_Sub5_Sub2 local21 = (Class3_Sub5_Sub2) local13;
				while ((local21.anInt8862 <= 8 || this.method2960() > (double) local21.method2015()) && local21.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local21.method7530(this.anOggPacket2);
				}
			}
		}
		this.method2965(this.aString42);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)D")
	public final double method2960() {
		if (this.aClass3_Sub5_Sub3_2 == null) {
			return this.aClass3_Sub5_Sub1_2 == null ? 0.0D : this.aClass3_Sub5_Sub1_2.method1146();
		} else {
			return this.aClass3_Sub5_Sub3_2.method5273();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZB)V")
	public final void method2961(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub5_Sub3_2 != null) {
			@Pc(7) Class3_Sub9_Sub3 local7 = this.aClass3_Sub5_Sub3_2.method5275();
			if (local7 != null) {
				local7.method5189(arg0);
			}
		}
		this.aBoolean275 = !this.aBoolean275;
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Lclient!qb;")
	private Class3_Sub5 method2962() throws IOException {
		if (this.aBoolean273) {
			throw new IllegalStateException();
		} else if (this.aBoolean274) {
			return null;
		} else {
			@Pc(30) int local30;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local30 = this.method2968(this.aByteArray25);
				if (local30 == -1) {
					this.aBoolean274 = true;
					return null;
				}
				if (local30 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray25, local30)) {
					throw new RuntimeException("");
				}
			}
			local30 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(77) Class3_Sub5 local77 = (Class3_Sub5) this.aClass62_18.method1682((long) local30);
				if (!local77.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local77;
			}
			@Pc(94) OggStreamState local94 = new OggStreamState(local30);
			if (!local94.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local94.packetPeek(this.anOggPacket2) == 1) {
				@Pc(136) Class3_Sub5 local136;
				if (this.aClass3_Sub5_Sub1_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub5_Sub1_2 = new Class3_Sub5_Sub1(local94);
					local136 = this.aClass3_Sub5_Sub1_2;
				} else if (this.aClass3_Sub5_Sub3_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub5_Sub3_2 = new Class3_Sub5_Sub3(local94);
					local136 = this.aClass3_Sub5_Sub3_2;
				} else {
					@Pc(142) byte[] local142 = this.anOggPacket2.getData();
					@Pc(146) StringBuffer local146 = new StringBuffer();
					for (@Pc(148) int local148 = 1; local148 < local142.length && Character.isLetterOrDigit((char) local142[local148]); local148++) {
						local146.append((char) local142[local148]);
					}
					@Pc(175) String local175 = local146.toString();
					if (local175.equals("kate")) {
						local136 = new Class3_Sub5_Sub2(local94);
					} else {
						local136 = new Class3_Sub5_Sub4(local94);
					}
				}
				this.aClass62_18.method1686((long) local30, local136);
				return local136;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V")
	public final void method2963() {
		if (this.aBoolean273) {
			return;
		}
		for (@Pc(21) Class3_Sub5 local21 = (Class3_Sub5) this.aClass62_18.method1680(); local21 != null; local21 = (Class3_Sub5) this.aClass62_18.method1681()) {
			local21.method7531();
			local21.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean273 = true;
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(B)Lclient!lr;")
	public final Class3_Sub5_Sub3 method2964() {
		return this.aClass3_Sub5_Sub3_2;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2965(@OriginalArg(0) String arg0) {
		this.aString42 = arg0;
		if (this.aString42 == null) {
			this.aClass3_Sub5_Sub2_2 = null;
			return;
		}
		if (this.aClass3_Sub5_Sub2_2 != null && !this.aString42.equals(this.aClass3_Sub5_Sub2_2.method2013())) {
			this.aClass3_Sub5_Sub2_2 = null;
		}
		if (this.aClass3_Sub5_Sub2_2 != null) {
			return;
		}
		for (@Pc(46) Class3_Sub5 local46 = (Class3_Sub5) this.aClass62_18.method1680(); local46 != null; local46 = (Class3_Sub5) this.aClass62_18.method1681()) {
			if (local46 instanceof Class3_Sub5_Sub2) {
				@Pc(54) Class3_Sub5_Sub2 local54 = (Class3_Sub5_Sub2) local46;
				if (this.aString42.equals(local54.method2013())) {
					this.aClass3_Sub5_Sub2_2 = local54;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
	public final void method2966() throws IOException {
		if (this.aBoolean275) {
			return;
		}
		while (!this.aBoolean273) {
			@Pc(26) Class3_Sub5 local26;
			if (this.aBoolean271) {
				local26 = (Class3_Sub5) this.aClass62_18.method1682((long) this.anOggPage2.getSerialNumber());
			} else {
				local26 = this.method2962();
				if (local26 == null) {
					if (this.aBoolean274) {
						this.method2956();
					}
					return;
				}
				if (local26 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean271 = true;
			}
			if (local26 == this.aClass3_Sub5_Sub3_2) {
				if (this.aClass3_Sub5_Sub3_2.method5279() >= 50) {
					return;
				}
				while (this.aClass3_Sub5_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub5_Sub3_2.method7530(this.anOggPacket2);
					this.method2958();
					if (this.aClass3_Sub5_Sub1_2 != null) {
						@Pc(78) double local78 = this.aClass3_Sub5_Sub1_2.method1146();
						for (@Pc(80) int local80 = 0; local80 < 10 && this.method2957(); local80++) {
							this.method2969();
							if (this.aBoolean273) {
								return;
							}
						}
						if (local78 < this.aClass3_Sub5_Sub1_2.method1146()) {
							return;
						}
					}
					if (this.aClass3_Sub5_Sub3_2.method5279() >= 50) {
						return;
					}
				}
			} else if (local26 instanceof Class3_Sub5_Sub2) {
				this.method2958();
			} else if (local26 != this.aClass3_Sub5_Sub1_2) {
				while (local26.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local26.anInt8862 == 1 && local26 instanceof Class3_Sub5_Sub2) {
						this.method2965(this.aString42);
					}
					local26.method7530(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub5_Sub3_2 == null && !this.aBoolean275) {
				for (@Pc(169) int local169 = 0; local169 < 10 && this.method2957(); local169++) {
					this.method2969();
					if (this.aBoolean273) {
						return;
					}
				}
				return;
			}
			this.aBoolean271 = false;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[B)I")
	protected abstract int method2968(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "(I)V")
	private void method2969() throws IOException {
		while (this.aClass3_Sub5_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(17) Class3_Sub5 local17 = this.method2962();
			if (local17 == null) {
				if (this.aBoolean274) {
					this.method2956();
				}
				return;
			}
			if (this.aClass3_Sub5_Sub2_2 == local17) {
				this.method2958();
			}
		}
		this.aClass3_Sub5_Sub1_2.method7530(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "(I)Lclient!bd;")
	public final Class3_Sub5_Sub1 method2970() {
		return this.aClass3_Sub5_Sub1_2;
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(B)Z")
	public final boolean method2971() {
		if (this.aBoolean273 || this.aBoolean274) {
			return this.aClass3_Sub5_Sub3_2 == null || this.aClass3_Sub5_Sub3_2.method5279() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "(I)Lclient!dfa;")
	public final Class3_Sub5_Sub2 method2972() {
		return this.aClass3_Sub5_Sub2_2;
	}
}
