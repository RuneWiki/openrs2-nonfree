import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class228 {

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!ho;")
	private Class103 aClass103_4 = null;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "Lclient!ho;")
	private Class103 aClass103_3 = null;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	private int anInt6252 = 65000;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
	private final int anInt6245;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(ILclient!ho;Lclient!ho;I)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3) {
		this.anInt6252 = arg3;
		this.aClass103_3 = arg1;
		this.aClass103_4 = arg2;
		this.anInt6245 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6245;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method4864(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class103 local8 = this.aClass103_3;
		synchronized (this.aClass103_3) {
			try {
				@Pc(31) int local31;
				if (arg0) {
					if (this.aClass103_4.method2522() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass103_4.method2519((long) (arg1 * 6));
					this.aClass103_4.method2521(6, 0, Static275.aByteArray67);
					local31 = (Static275.aByteArray67[5] & 0xFF) + (((Static275.aByteArray67[3] & 0xFF) << 16) + ((Static275.aByteArray67[4] & 0xFF) << 8));
					if (local31 <= 0 || this.aClass103_3.method2522() / 520L < (long) local31) {
						return false;
					}
				} else {
					local31 = (int) ((this.aClass103_3.method2522() + 519L) / 520L);
					if (local31 == 0) {
						local31 = 1;
					}
				}
				Static275.aByteArray67[0] = (byte) (arg3 >> 16);
				Static275.aByteArray67[2] = (byte) arg3;
				Static275.aByteArray67[1] = (byte) (arg3 >> 8);
				Static275.aByteArray67[5] = (byte) local31;
				Static275.aByteArray67[4] = (byte) (local31 >> 8);
				Static275.aByteArray67[3] = (byte) (local31 >> 16);
				this.aClass103_4.method2519((long) (arg1 * 6));
				this.aClass103_4.method2518(Static275.aByteArray67, 6, 0);
				@Pc(170) int local170 = 0;
				@Pc(172) int local172 = 0;
				while (local170 < arg3) {
					@Pc(176) int local176 = 0;
					@Pc(211) int local211;
					if (arg0) {
						this.aClass103_3.method2519((long) (local31 * 520));
						try {
							this.aClass103_3.method2521(8, 0, Static275.aByteArray67);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local211 = ((Static275.aByteArray67[0] & 0xFF) << 8) + (Static275.aByteArray67[1] & 0xFF);
						local176 = ((Static275.aByteArray67[5] & 0xFF) << 8) + ((Static275.aByteArray67[4] & 0xFF) << 16) + (Static275.aByteArray67[6] & 0xFF);
						@Pc(248) int local248 = ((Static275.aByteArray67[2] & 0xFF) << 8) + (Static275.aByteArray67[3] & 0xFF);
						@Pc(254) int local254 = Static275.aByteArray67[7] & 0xFF;
						if (arg1 != local211 || local248 != local172 || this.anInt6245 != local254) {
							return false;
						}
						if (local176 < 0 || this.aClass103_3.method2522() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						local176 = (int) ((this.aClass103_3.method2522() + 519L) / 520L);
						arg0 = false;
						if (local176 == 0) {
							local176++;
						}
						if (local31 == local176) {
							local176++;
						}
					}
					Static275.aByteArray67[1] = (byte) arg1;
					Static275.aByteArray67[0] = (byte) (arg1 >> 8);
					if (arg3 - local170 <= 512) {
						local176 = 0;
					}
					Static275.aByteArray67[3] = (byte) local172;
					Static275.aByteArray67[2] = (byte) (local172 >> 8);
					Static275.aByteArray67[7] = (byte) this.anInt6245;
					Static275.aByteArray67[5] = (byte) (local176 >> 8);
					Static275.aByteArray67[4] = (byte) (local176 >> 16);
					Static275.aByteArray67[6] = (byte) local176;
					this.aClass103_3.method2519((long) (local31 * 520));
					this.aClass103_3.method2518(Static275.aByteArray67, 8, 0);
					local211 = arg3 - local170;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass103_3.method2518(arg2, local211, local170);
					local31 = local176;
					local170 += local211;
					local172++;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI[BI)Z")
	public boolean method4865(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class103 local14 = this.aClass103_3;
		synchronized (this.aClass103_3) {
			if (arg0 < 0 || arg0 > this.anInt6252) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method4864(true, arg2, arg1, arg0);
			if (!local34) {
				local34 = this.method4864(false, arg2, arg1, arg0);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)[B")
	public byte[] method4866(@OriginalArg(1) int arg0) {
		@Pc(8) Class103 local8 = this.aClass103_3;
		synchronized (this.aClass103_3) {
			try {
				if (this.aClass103_4.method2522() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass103_4.method2519((long) (arg0 * 6));
				this.aClass103_4.method2521(6, 0, Static275.aByteArray67);
				@Pc(78) int local78 = (Static275.aByteArray67[2] & 0xFF) + ((Static275.aByteArray67[0] & 0xFF) << 16) + ((Static275.aByteArray67[1] & 0xFF) << 8);
				@Pc(101) int local101 = (Static275.aByteArray67[5] & 0xFF) + (((Static275.aByteArray67[3] & 0xFF) << 16) + ((Static275.aByteArray67[4] & 0xFF) << 8));
				if (local78 < 0 || this.anInt6252 < local78) {
					return null;
				} else if (local101 > 0 && (long) local101 <= this.aClass103_3.method2522() / 520L) {
					@Pc(144) byte[] local144 = new byte[local78];
					@Pc(146) int local146 = 0;
					@Pc(148) int local148 = 0;
					while (local146 < local78) {
						if (local101 == 0) {
							return null;
						}
						this.aClass103_3.method2519((long) (local101 * 520));
						@Pc(171) int local171 = local78 - local146;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass103_3.method2521(local171 + 8, 0, Static275.aByteArray67);
						@Pc(199) int local199 = (Static275.aByteArray67[1] & 0xFF) + ((Static275.aByteArray67[0] & 0xFF) << 8);
						@Pc(213) int local213 = (Static275.aByteArray67[3] & 0xFF) + ((Static275.aByteArray67[2] & 0xFF) << 8);
						@Pc(235) int local235 = (Static275.aByteArray67[6] & 0xFF) + ((Static275.aByteArray67[5] & 0xFF) << 8) + ((Static275.aByteArray67[4] & 0xFF) << 16);
						@Pc(241) int local241 = Static275.aByteArray67[7] & 0xFF;
						if (arg0 == local199 && local213 == local148 && local241 == this.anInt6245) {
							if (local235 >= 0 && (long) local235 <= this.aClass103_3.method2522() / 520L) {
								for (@Pc(277) int local277 = 0; local277 < local171; local277++) {
									local144[local146++] = Static275.aByteArray67[local277 + 8];
								}
								local148++;
								local101 = local235;
								continue;
							}
							return null;
						}
						return null;
					}
					return local144;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}
}
