import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public abstract class Class52 {

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Z")
	private boolean aBoolean109;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!fda;")
	private Class2_Sub16_Sub2 aClass2_Sub16_Sub2_2;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Z")
	private boolean aBoolean111;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Z")
	private boolean aBoolean112;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Lclient!dp;")
	private Class2_Sub16_Sub1 aClass2_Sub16_Sub1_2;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "Lclient!gg;")
	private Class2_Sub16_Sub3 aClass2_Sub16_Sub3_2;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "Lclient!mp;")
	private final Class222 aClass222_4;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
	protected Class52(@OriginalArg(0) int arg0) {
		if (!Static472.method6791("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray20 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass222_4 = new Class222(8);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)D")
	public final double method1215() {
		if (this.aClass2_Sub16_Sub1_2 == null) {
			return this.aClass2_Sub16_Sub2_2 == null ? 0.0D : this.aClass2_Sub16_Sub2_2.method2809();
		} else {
			return this.aClass2_Sub16_Sub1_2.method1729();
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	private void method1217() throws IOException {
		while (this.aClass2_Sub16_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(18) Class2_Sub16 local18 = this.method1221();
			if (local18 == null) {
				if (this.aBoolean109) {
					this.method1222();
				}
				return;
			}
			if (this.aClass2_Sub16_Sub3_2 == local18) {
				this.method1230();
			}
		}
		this.aClass2_Sub16_Sub2_2.method6551(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	public final void method1218() throws IOException {
		if (this.aBoolean112) {
			return;
		}
		while (!this.aBoolean111) {
			@Pc(25) Class2_Sub16 local25;
			if (this.aBoolean110) {
				local25 = (Class2_Sub16) this.aClass222_4.method5468((long) this.anOggPage2.getSerialNumber());
			} else {
				local25 = this.method1221();
				if (local25 == null) {
					if (this.aBoolean109) {
						this.method1222();
					}
					return;
				}
				if (local25 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean110 = true;
			}
			if (this.aClass2_Sub16_Sub1_2 == local25) {
				if (this.aClass2_Sub16_Sub1_2.method1730() >= 50) {
					return;
				}
				while (this.aClass2_Sub16_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub16_Sub1_2.method6551(this.anOggPacket2);
					this.method1230();
					if (this.aClass2_Sub16_Sub2_2 != null) {
						@Pc(85) double local85 = this.aClass2_Sub16_Sub2_2.method2809();
						for (@Pc(87) int local87 = 0; local87 < 10 && this.method1223(); local87++) {
							this.method1217();
							if (this.aBoolean111) {
								return;
							}
						}
						if (this.aClass2_Sub16_Sub2_2.method2809() > local85) {
							return;
						}
					}
					if (this.aClass2_Sub16_Sub1_2.method1730() >= 50) {
						return;
					}
				}
			} else if (local25 instanceof Class2_Sub16_Sub3) {
				this.method1230();
			} else if (this.aClass2_Sub16_Sub2_2 != local25) {
				while (local25.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local25.anInt7815 == 1 && local25 instanceof Class2_Sub16_Sub3) {
						this.method1231(this.aString16);
					}
					local25.method6551(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub16_Sub1_2 == null && !this.aBoolean112) {
				for (@Pc(152) int local152 = 0; local152 < 10 && this.method1223(); local152++) {
					this.method1217();
					if (this.aBoolean111) {
						return;
					}
				}
				return;
			}
			this.aBoolean110 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[B)I")
	protected abstract int method1219(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Lclient!gg;")
	public final Class2_Sub16_Sub3 method1220() {
		return this.aClass2_Sub16_Sub3_2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Lclient!mg;")
	private Class2_Sub16 method1221() throws IOException {
		if (this.aBoolean111) {
			throw new IllegalStateException();
		} else if (this.aBoolean109) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method1219(this.aByteArray20);
				if (local23 == -1) {
					this.aBoolean109 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray20, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(74) Class2_Sub16 local74 = (Class2_Sub16) this.aClass222_4.method5468((long) local23);
				if (!local74.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local74;
			}
			@Pc(91) OggStreamState local91 = new OggStreamState(local23);
			if (!local91.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local91.packetPeek(this.anOggPacket2) == 1) {
				@Pc(128) Class2_Sub16 local128;
				if (this.aClass2_Sub16_Sub2_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub16_Sub2_2 = new Class2_Sub16_Sub2(local91);
					local128 = this.aClass2_Sub16_Sub2_2;
				} else if (this.aClass2_Sub16_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub16_Sub1_2 = new Class2_Sub16_Sub1(local91);
					local128 = this.aClass2_Sub16_Sub1_2;
				} else {
					@Pc(152) byte[] local152 = this.anOggPacket2.getData();
					@Pc(156) StringBuffer local156 = new StringBuffer();
					for (@Pc(158) int local158 = 1; local152.length > local158 && Character.isLetterOrDigit((char) local152[local158]); local158++) {
						local156.append((char) local152[local158]);
					}
					@Pc(185) String local185 = local156.toString();
					if (local185.equals("kate")) {
						local128 = new Class2_Sub16_Sub3(local91);
					} else {
						local128 = new Class2_Sub16_Sub4(local91);
					}
				}
				this.aClass222_4.method5476(local128, (long) local23);
				return local128;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
	private void method1222() {
		for (@Pc(18) Class2_Sub16 local18 = (Class2_Sub16) this.aClass222_4.method5474(); local18 != null; local18 = (Class2_Sub16) this.aClass222_4.method5472()) {
			if (local18 != this.aClass2_Sub16_Sub2_2) {
				while (local18.anOggStreamState5.packetOut() == 1) {
					local18.method6551(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub16_Sub2_2 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
			if (!this.method1223()) {
				return;
			}
			if (this.aClass2_Sub16_Sub2_2.anOggStreamState5.packetOut() != 1) {
				this.method1225();
				return;
			}
			this.aClass2_Sub16_Sub2_2.method6551(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Z")
	private boolean method1223() {
		if (this.aClass2_Sub16_Sub1_2 == null) {
			@Pc(17) double local17 = (double) this.aClass2_Sub16_Sub2_2.method2806();
			return local17 == 0.0D || (double) Static438.method6517() >= (double) this.aClass2_Sub16_Sub2_2.method2814() + 1000.0D / local17;
		} else {
			return !this.aClass2_Sub16_Sub2_2.method2812() || this.method1215() > this.aClass2_Sub16_Sub2_2.method2809();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
	public final void method1224(@OriginalArg(0) boolean arg0) {
		if (this.aClass2_Sub16_Sub1_2 != null) {
			@Pc(7) Class2_Sub2_Sub4 local7 = this.aClass2_Sub16_Sub1_2.method1731();
			if (local7 != null) {
				local7.method5443(arg0);
			}
		}
		this.aBoolean112 = !this.aBoolean112;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	public final void method1225() {
		if (this.aBoolean111) {
			return;
		}
		for (@Pc(20) Class2_Sub16 local20 = (Class2_Sub16) this.aClass222_4.method5474(); local20 != null; local20 = (Class2_Sub16) this.aClass222_4.method5472()) {
			local20.method6550();
			local20.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean111 = true;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Lclient!fda;")
	public final Class2_Sub16_Sub2 method1226() {
		return this.aClass2_Sub16_Sub2_2;
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)Z")
	public final boolean method1227() {
		if (this.aBoolean111 || this.aBoolean109) {
			return this.aClass2_Sub16_Sub1_2 == null || this.aClass2_Sub16_Sub1_2.method1730() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)Lclient!dp;")
	public final Class2_Sub16_Sub1 method1228() {
		return this.aClass2_Sub16_Sub1_2;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	private void method1230() {
		for (@Pc(7) Class2_Sub16 local7 = (Class2_Sub16) this.aClass222_4.method5474(); local7 != null; local7 = (Class2_Sub16) this.aClass222_4.method5472()) {
			if (local7 instanceof Class2_Sub16_Sub3) {
				@Pc(15) Class2_Sub16_Sub3 local15 = (Class2_Sub16_Sub3) local7;
				while ((local15.anInt7815 <= 8 || this.method1215() > (double) local15.method3277()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method6551(this.anOggPacket2);
				}
			}
		}
		this.method1231(this.aString16);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method1231(@OriginalArg(1) String arg0) {
		this.aString16 = arg0;
		if (this.aString16 == null) {
			this.aClass2_Sub16_Sub3_2 = null;
			return;
		}
		if (this.aClass2_Sub16_Sub3_2 != null && !this.aString16.equals(this.aClass2_Sub16_Sub3_2.method3276())) {
			this.aClass2_Sub16_Sub3_2 = null;
		}
		if (this.aClass2_Sub16_Sub3_2 != null) {
			return;
		}
		for (@Pc(43) Class2_Sub16 local43 = (Class2_Sub16) this.aClass222_4.method5474(); local43 != null; local43 = (Class2_Sub16) this.aClass222_4.method5472()) {
			if (local43 instanceof Class2_Sub16_Sub3) {
				@Pc(50) Class2_Sub16_Sub3 local50 = (Class2_Sub16_Sub3) local43;
				if (this.aString16.equals(local50.method3276())) {
					this.aClass2_Sub16_Sub3_2 = local50;
					return;
				}
			}
		}
	}
}
