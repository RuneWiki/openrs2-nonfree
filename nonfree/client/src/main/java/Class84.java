import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class84 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	private int anInt2451 = 65000;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!so;")
	private Class227 aClass227_5 = null;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!so;")
	private Class227 aClass227_4 = null;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
	private final int anInt2452;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILclient!so;Lclient!so;I)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class227 arg2, @OriginalArg(3) int arg3) {
		this.aClass227_4 = arg1;
		this.anInt2451 = arg3;
		this.anInt2452 = arg0;
		this.aClass227_5 = arg2;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([BIZII)Z")
	private boolean method2093(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class227 local8 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass227_5.method4995() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass227_5.method4997((long) (arg1 * 6));
					this.aClass227_5.method4991(0, 6, Static317.aByteArray70);
					local22 = ((Static317.aByteArray70[4] & 0xFF) << 8) + (Static317.aByteArray70[3] << 16 & 0xFF0000) + (Static317.aByteArray70[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass227_4.method4995() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass227_4.method4995() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static317.aByteArray70[4] = (byte) (local22 >> 8);
				Static317.aByteArray70[5] = (byte) local22;
				Static317.aByteArray70[2] = (byte) arg3;
				Static317.aByteArray70[1] = (byte) (arg3 >> 8);
				Static317.aByteArray70[0] = (byte) (arg3 >> 16);
				Static317.aByteArray70[3] = (byte) (local22 >> 16);
				this.aClass227_5.method4997((long) (arg1 * 6));
				this.aClass227_5.method4992(Static317.aByteArray70, 6, 0);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (local174 < arg3) {
					@Pc(180) int local180 = 0;
					@Pc(216) int local216;
					if (arg2) {
						this.aClass227_4.method4997((long) (local22 * 520));
						try {
							this.aClass227_4.method4991(0, 8, Static317.aByteArray70);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local216 = ((Static317.aByteArray70[0] & 0xFF) << 8) + (Static317.aByteArray70[1] & 0xFF);
						@Pc(230) int local230 = ((Static317.aByteArray70[2] & 0xFF) << 8) + (Static317.aByteArray70[3] & 0xFF);
						local180 = (Static317.aByteArray70[6] & 0xFF) + ((Static317.aByteArray70[5] & 0xFF) << 8) + ((Static317.aByteArray70[4] & 0xFF) << 16);
						@Pc(258) int local258 = Static317.aByteArray70[7] & 0xFF;
						if (arg1 != local216 || local176 != local230 || local258 != this.anInt2452) {
							return false;
						}
						if (local180 < 0 || (long) local180 > this.aClass227_4.method4995() / 520L) {
							return false;
						}
					}
					if (local180 == 0) {
						arg2 = false;
						local180 = (int) ((this.aClass227_4.method4995() + 519L) / 520L);
						if (local180 == 0) {
							local180++;
						}
						if (local22 == local180) {
							local180++;
						}
					}
					Static317.aByteArray70[3] = (byte) local176;
					Static317.aByteArray70[0] = (byte) (arg1 >> 8);
					Static317.aByteArray70[2] = (byte) (local176 >> 8);
					if (arg3 - local174 <= 512) {
						local180 = 0;
					}
					Static317.aByteArray70[1] = (byte) arg1;
					Static317.aByteArray70[5] = (byte) (local180 >> 8);
					Static317.aByteArray70[4] = (byte) (local180 >> 16);
					Static317.aByteArray70[7] = (byte) this.anInt2452;
					Static317.aByteArray70[6] = (byte) local180;
					this.aClass227_4.method4997((long) (local22 * 520));
					this.aClass227_4.method4992(Static317.aByteArray70, 8, 0);
					local216 = arg3 - local174;
					if (local216 > 512) {
						local216 = 512;
					}
					this.aClass227_4.method4992(arg0, local216, local174);
					local174 += local216;
					local22 = local180;
					local176++;
				}
				return true;
			} catch (@Pc(437) IOException local437) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[BIB)Z")
	public boolean method2095(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class227 local6 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			if (arg2 < 0 || arg2 > this.anInt2451) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method2093(arg1, arg0, true, arg2);
			if (!local35) {
				local35 = this.method2093(arg1, arg0, false, arg2);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)[B")
	public byte[] method2096(@OriginalArg(1) int arg0) {
		@Pc(8) Class227 local8 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass227_5.method4995()) {
					return null;
				}
				this.aClass227_5.method4997((long) (arg0 * 6));
				this.aClass227_5.method4991(0, 6, Static317.aByteArray70);
				@Pc(69) int local69 = (Static317.aByteArray70[2] & 0xFF) + ((Static317.aByteArray70[0] & 0xFF) << 16) + ((Static317.aByteArray70[1] & 0xFF) << 8);
				@Pc(92) int local92 = ((Static317.aByteArray70[4] & 0xFF) << 8) + ((Static317.aByteArray70[3] & 0xFF) << 16) + (Static317.aByteArray70[5] & 0xFF);
				if (local69 < 0 || this.anInt2451 < local69) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass227_4.method4995() / 520L) {
					@Pc(128) byte[] local128 = new byte[local69];
					@Pc(130) int local130 = 0;
					@Pc(132) int local132 = 0;
					while (local69 > local130) {
						if (local92 == 0) {
							return null;
						}
						this.aClass227_4.method4997((long) (local92 * 520));
						@Pc(160) int local160 = local69 - local130;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass227_4.method4991(0, local160 + 8, Static317.aByteArray70);
						@Pc(190) int local190 = (Static317.aByteArray70[1] & 0xFF) + ((Static317.aByteArray70[0] & 0xFF) << 8);
						@Pc(204) int local204 = (Static317.aByteArray70[3] & 0xFF) + ((Static317.aByteArray70[2] & 0xFF) << 8);
						@Pc(226) int local226 = (Static317.aByteArray70[6] & 0xFF) + ((Static317.aByteArray70[5] & 0xFF) << 8) + ((Static317.aByteArray70[4] & 0xFF) << 16);
						@Pc(232) int local232 = Static317.aByteArray70[7] & 0xFF;
						if (local190 == arg0 && local132 == local204 && this.anInt2452 == local232) {
							if (local226 >= 0 && this.aClass227_4.method4995() / 520L >= (long) local226) {
								for (@Pc(275) int local275 = 0; local275 < local160; local275++) {
									local128[local130++] = Static317.aByteArray70[local275 + 8];
								}
								local92 = local226;
								local132++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local128;
				} else {
					return null;
				}
			} catch (@Pc(303) IOException local303) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2452;
	}
}
