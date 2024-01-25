import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class217 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!hv;")
	private Class110 aClass110_26 = null;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!hv;")
	private Class110 aClass110_27 = null;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
	private int anInt5950 = 65000;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	private final int anInt5946;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(ILclient!hv;Lclient!hv;I)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(3) int arg3) {
		this.aClass110_27 = arg1;
		this.anInt5946 = arg0;
		this.anInt5950 = arg3;
		this.aClass110_26 = arg2;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II[BZZ)Z")
	private boolean method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class110 local8 = this.aClass110_27;
		synchronized (this.aClass110_27) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass110_26.method2271()) {
						return false;
					}
					this.aClass110_26.method2262((long) (arg1 * 6));
					this.aClass110_26.method2267(6, Static444.aByteArray92, 0);
					local22 = ((Static444.aByteArray92[4] & 0xFF) << 8) + ((Static444.aByteArray92[3] & 0xFF) << 16) + (Static444.aByteArray92[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass110_27.method2271() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass110_27.method2271() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static444.aByteArray92[1] = (byte) (arg0 >> 8);
				Static444.aByteArray92[0] = (byte) (arg0 >> 16);
				Static444.aByteArray92[4] = (byte) (local22 >> 8);
				Static444.aByteArray92[5] = (byte) local22;
				Static444.aByteArray92[3] = (byte) (local22 >> 16);
				Static444.aByteArray92[2] = (byte) arg0;
				this.aClass110_26.method2262((long) (arg1 * 6));
				this.aClass110_26.method2269(6, Static444.aByteArray92, 0);
				@Pc(170) int local170 = 0;
				@Pc(172) int local172 = 0;
				while (local170 < arg0) {
					@Pc(182) int local182 = 0;
					@Pc(218) int local218;
					if (arg3) {
						this.aClass110_27.method2262((long) (local22 * 520));
						try {
							this.aClass110_27.method2267(8, Static444.aByteArray92, 0);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local218 = ((Static444.aByteArray92[0] & 0xFF) << 8) + (Static444.aByteArray92[1] & 0xFF);
						@Pc(232) int local232 = ((Static444.aByteArray92[2] & 0xFF) << 8) + (Static444.aByteArray92[3] & 0xFF);
						local182 = ((Static444.aByteArray92[4] & 0xFF) << 16) - (-((Static444.aByteArray92[5] & 0xFF) << 8) - (Static444.aByteArray92[6] & 0xFF));
						@Pc(261) int local261 = Static444.aByteArray92[7] & 0xFF;
						if (arg1 != local218 || local232 != local172 || this.anInt5946 != local261) {
							return false;
						}
						if (local182 < 0 || (long) local182 > this.aClass110_27.method2271() / 520L) {
							return false;
						}
					}
					if (local182 == 0) {
						arg3 = false;
						local182 = (int) ((this.aClass110_27.method2271() + 519L) / 520L);
						if (local182 == 0) {
							local182++;
						}
						if (local22 == local182) {
							local182++;
						}
					}
					Static444.aByteArray92[2] = (byte) (local172 >> 8);
					Static444.aByteArray92[3] = (byte) local172;
					if (arg0 - local170 <= 512) {
						local182 = 0;
					}
					Static444.aByteArray92[0] = (byte) (arg1 >> 8);
					Static444.aByteArray92[1] = (byte) arg1;
					Static444.aByteArray92[6] = (byte) local182;
					Static444.aByteArray92[5] = (byte) (local182 >> 8);
					Static444.aByteArray92[4] = (byte) (local182 >> 16);
					Static444.aByteArray92[7] = (byte) this.anInt5946;
					this.aClass110_27.method2262((long) (local22 * 520));
					this.aClass110_27.method2269(8, Static444.aByteArray92, 0);
					local218 = arg0 - local170;
					if (local218 > 512) {
						local218 = 512;
					}
					this.aClass110_27.method2269(local218, arg2, local170);
					local22 = local182;
					local172++;
					local170 += local218;
				}
				return true;
			} catch (@Pc(443) IOException local443) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[B")
	public byte[] method4650(@OriginalArg(0) int arg0) {
		@Pc(8) Class110 local8 = this.aClass110_27;
		synchronized (this.aClass110_27) {
			try {
				if (this.aClass110_26.method2271() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass110_26.method2262((long) (arg0 * 6));
				this.aClass110_26.method2267(6, Static444.aByteArray92, 0);
				@Pc(69) int local69 = ((Static444.aByteArray92[1] & 0xFF) << 8) + ((Static444.aByteArray92[0] & 0xFF) << 16) + (Static444.aByteArray92[2] & 0xFF);
				@Pc(91) int local91 = ((Static444.aByteArray92[4] & 0xFF) << 8) + ((Static444.aByteArray92[3] & 0xFF) << 16) + (Static444.aByteArray92[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt5950) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass110_27.method2271() / 520L) {
					@Pc(135) byte[] local135 = new byte[local69];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local69 > local137) {
						if (local91 == 0) {
							return null;
						}
						this.aClass110_27.method2262((long) (local91 * 520));
						@Pc(162) int local162 = local69 - local137;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass110_27.method2267(local162 + 8, Static444.aByteArray92, 0);
						@Pc(190) int local190 = (Static444.aByteArray92[1] & 0xFF) + ((Static444.aByteArray92[0] & 0xFF) << 8);
						@Pc(204) int local204 = ((Static444.aByteArray92[2] & 0xFF) << 8) + (Static444.aByteArray92[3] & 0xFF);
						@Pc(227) int local227 = ((Static444.aByteArray92[5] & 0xFF) << 8) + ((Static444.aByteArray92[4] << 16 & 0xFF0000) + (Static444.aByteArray92[6] & 0xFF));
						@Pc(233) int local233 = Static444.aByteArray92[7] & 0xFF;
						if (local190 == arg0 && local139 == local204 && this.anInt5946 == local233) {
							if (local227 >= 0 && (long) local227 <= this.aClass110_27.method2271() / 520L) {
								local91 = local227;
								for (@Pc(275) int local275 = 0; local275 < local162; local275++) {
									local135[local137++] = Static444.aByteArray92[local275 + 8];
								}
								local139++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(311) IOException local311) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[B)Z")
	public boolean method4652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class110 local6 = this.aClass110_27;
		synchronized (this.aClass110_27) {
			if (arg0 < 0 || arg0 > this.anInt5950) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method4649(arg0, arg1, arg2, true);
			if (!local29) {
				local29 = this.method4649(arg0, arg1, arg2, false);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!ro", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5946;
	}
}
