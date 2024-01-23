import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class88 {

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Lclient!ub;")
	private Class99 aClass99_5 = null;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!ub;")
	private Class99 aClass99_4 = null;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt4416 = 65000;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "I")
	private int anInt4420;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ILclient!ub;Lclient!ub;I)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) int arg3) {
		this.anInt4420 = arg0;
		this.anInt4416 = arg3;
		this.aClass99_4 = arg1;
		this.aClass99_5 = arg2;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)Z")
	public boolean method3493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(11) Class99 local11 = this.aClass99_4;
		synchronized (this.aClass99_4) {
			if (arg0 < 0 || arg0 > this.anInt4416) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method3494(arg1, arg0, arg2, true);
			if (!local34) {
				local34 = this.method3494(arg1, arg0, arg2, false);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II[BZI)Z")
	private boolean method3494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class99 local8 = this.aClass99_4;
		synchronized (this.aClass99_4) {
			try {
				@Pc(72) int local72;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass99_5.method3573()) {
						return false;
					}
					this.aClass99_5.method3579((long) (arg0 * 6));
					this.aClass99_5.method3581(0, Static32.aByteArray50, 6);
					local72 = ((Static32.aByteArray50[4] & 0xFF) << 8) + (((Static32.aByteArray50[3] & 0xFF) << 16) + (Static32.aByteArray50[5] & 0xFF));
					if (local72 <= 0 || (long) local72 > this.aClass99_4.method3573() / 520L) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass99_4.method3573() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static32.aByteArray50[1] = (byte) (arg1 >> 8);
				Static32.aByteArray50[0] = (byte) (arg1 >> 16);
				Static32.aByteArray50[5] = (byte) local72;
				@Pc(137) int local137 = 0;
				Static32.aByteArray50[2] = (byte) arg1;
				Static32.aByteArray50[3] = (byte) (local72 >> 16);
				Static32.aByteArray50[4] = (byte) (local72 >> 8);
				@Pc(158) int local158 = 0;
				this.aClass99_5.method3579((long) (arg0 * 6));
				this.aClass99_5.method3574(0, 6, Static32.aByteArray50);
				while (arg1 > local137) {
					@Pc(177) int local177 = 0;
					@Pc(235) int local235;
					if (arg3) {
						this.aClass99_4.method3579((long) (local72 * 520));
						try {
							this.aClass99_4.method3581(0, Static32.aByteArray50, 8);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local177 = ((Static32.aByteArray50[4] & 0xFF) << 16) + (((Static32.aByteArray50[5] & 0xFF) << 8) + (Static32.aByteArray50[6] & 0xFF));
						local235 = (Static32.aByteArray50[1] & 0xFF) + ((Static32.aByteArray50[0] & 0xFF) << 8);
						@Pc(250) int local250 = ((Static32.aByteArray50[2] & 0xFF) << 8) + (Static32.aByteArray50[3] & 0xFF);
						@Pc(256) int local256 = Static32.aByteArray50[7] & 0xFF;
						if (local235 != arg0 || local250 != local158 || this.anInt4420 != local256) {
							return false;
						}
						if (local177 < 0 || (long) local177 > this.aClass99_4.method3573() / 520L) {
							return false;
						}
					}
					local235 = arg1 - local137;
					if (local177 == 0) {
						arg3 = false;
						local177 = (int) ((this.aClass99_4.method3573() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local177 == local72) {
							local177++;
						}
					}
					Static32.aByteArray50[1] = (byte) arg0;
					Static32.aByteArray50[7] = (byte) this.anInt4420;
					Static32.aByteArray50[0] = (byte) (arg0 >> 8);
					Static32.aByteArray50[3] = (byte) local158;
					if (arg1 - local137 <= 512) {
						local177 = 0;
					}
					Static32.aByteArray50[4] = (byte) (local177 >> 16);
					Static32.aByteArray50[5] = (byte) (local177 >> 8);
					if (local235 > 512) {
						local235 = 512;
					}
					Static32.aByteArray50[2] = (byte) (local158 >> 8);
					Static32.aByteArray50[6] = (byte) local177;
					this.aClass99_4.method3579((long) (local72 * 520));
					local72 = local177;
					local158++;
					this.aClass99_4.method3574(0, 8, Static32.aByteArray50);
					this.aClass99_4.method3574(local137, local235, arg2);
					local137 += local235;
				}
				return true;
			} catch (@Pc(431) IOException local431) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[B")
	public byte[] method3495(@OriginalArg(1) int arg0) {
		@Pc(8) Class99 local8 = this.aClass99_4;
		synchronized (this.aClass99_4) {
			try {
				if (this.aClass99_5.method3573() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass99_5.method3579((long) (arg0 * 6));
				this.aClass99_5.method3581(0, Static32.aByteArray50, 6);
				@Pc(65) int local65 = (Static32.aByteArray50[5] & 0xFF) + ((Static32.aByteArray50[4] & 0xFF) << 8) + ((Static32.aByteArray50[3] & 0xFF) << 16);
				@Pc(87) int local87 = (Static32.aByteArray50[2] & 0xFF) + ((Static32.aByteArray50[0] & 0xFF) << 16) + ((Static32.aByteArray50[1] & 0xFF) << 8);
				if (local87 < 0 || local87 > this.anInt4416) {
					return null;
				} else if (local65 > 0 && this.aClass99_4.method3573() / 520L >= (long) local65) {
					@Pc(123) byte[] local123 = new byte[local87];
					@Pc(125) int local125 = 0;
					@Pc(127) int local127 = 0;
					label55: while (local125 < local87) {
						if (local65 == 0) {
							return null;
						}
						this.aClass99_4.method3579((long) (local65 * 520));
						@Pc(152) int local152 = local87 - local125;
						if (local152 > 512) {
							local152 = 512;
						}
						this.aClass99_4.method3581(0, Static32.aByteArray50, local152 + 8);
						@Pc(182) int local182 = ((Static32.aByteArray50[0] & 0xFF) << 8) + (Static32.aByteArray50[1] & 0xFF);
						@Pc(196) int local196 = (Static32.aByteArray50[3] & 0xFF) + ((Static32.aByteArray50[2] & 0xFF) << 8);
						@Pc(220) int local220 = ((Static32.aByteArray50[4] & 0xFF) << 16) + ((Static32.aByteArray50[5] & 0xFF) << 8) + (Static32.aByteArray50[6] & 0xFF);
						@Pc(226) int local226 = Static32.aByteArray50[7] & 0xFF;
						if (local182 == arg0 && local196 == local127 && local226 == this.anInt4420) {
							if (local220 >= 0 && (long) local220 <= this.aClass99_4.method3573() / 520L) {
								local65 = local220;
								local127++;
								@Pc(276) int local276 = 0;
								while (true) {
									if (local276 >= local152) {
										continue label55;
									}
									local123[local125++] = Static32.aByteArray50[local276 + 8];
									local276++;
								}
							}
							return null;
						}
						return null;
					}
					return local123;
				} else {
					return null;
				}
			} catch (@Pc(301) IOException local301) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4420;
	}
}
