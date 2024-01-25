import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class384 {

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	private int anInt10789 = 65000;

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "Lclient!mu;")
	private Class243 aClass243_5 = null;

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "Lclient!mu;")
	private Class243 aClass243_4 = null;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	private final int anInt10796;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(ILclient!mu;Lclient!mu;I)V")
	public Class384(@OriginalArg(0) int arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) int arg3) {
		this.anInt10789 = arg3;
		this.aClass243_5 = arg2;
		this.anInt10796 = arg0;
		this.aClass243_4 = arg1;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(BI)[B")
	public byte[] method9208(@OriginalArg(1) int arg0) {
		@Pc(6) Class243 local6 = this.aClass243_4;
		synchronized (this.aClass243_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass243_5.method5980()) {
					return null;
				}
				this.aClass243_5.method5982((long) (arg0 * 6));
				this.aClass243_5.method5981(Static113.aByteArray34, 0, 6);
				@Pc(67) int local67 = ((Static113.aByteArray34[0] & 0xFF) << 16) + ((Static113.aByteArray34[1] & 0xFF) << 8) + (Static113.aByteArray34[2] & 0xFF);
				@Pc(89) int local89 = ((Static113.aByteArray34[4] & 0xFF) << 8) + (Static113.aByteArray34[3] << 16 & 0xFF0000) + (Static113.aByteArray34[5] & 0xFF);
				if (local67 < 0 || local67 > this.anInt10789) {
					return null;
				} else if (local89 > 0 && this.aClass243_4.method5980() / 520L >= (long) local89) {
					@Pc(130) byte[] local130 = new byte[local67];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					label55: while (local140 < local67) {
						if (local89 == 0) {
							return null;
						}
						this.aClass243_4.method5982((long) (local89 * 520));
						@Pc(167) int local167 = local67 - local140;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass243_4.method5981(Static113.aByteArray34, 0, local167 + 8);
						@Pc(197) int local197 = (Static113.aByteArray34[1] & 0xFF) + ((Static113.aByteArray34[0] & 0xFF) << 8);
						@Pc(212) int local212 = ((Static113.aByteArray34[2] & 0xFF) << 8) + (Static113.aByteArray34[3] & 0xFF);
						@Pc(235) int local235 = ((Static113.aByteArray34[4] & 0xFF) << 16) + ((Static113.aByteArray34[5] & 0xFF) << 8) + (Static113.aByteArray34[6] & 0xFF);
						@Pc(241) int local241 = Static113.aByteArray34[7] & 0xFF;
						if (arg0 == local197 && local142 == local212 && this.anInt10796 == local241) {
							if (local235 >= 0 && this.aClass243_4.method5980() / 520L >= (long) local235) {
								local89 = local235;
								local142++;
								@Pc(301) int local301 = 0;
								while (true) {
									if (local301 >= local167) {
										continue label55;
									}
									local130[local140++] = Static113.aByteArray34[local301 + 8];
									local301++;
								}
							}
							return null;
						}
						return null;
					}
					return local130;
				} else {
					return null;
				}
			} catch (@Pc(331) IOException local331) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B[BII)Z")
	public boolean method9209(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class243 local14 = this.aClass243_4;
		synchronized (this.aClass243_4) {
			if (arg1 < 0 || this.anInt10789 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(42) boolean local42 = this.method9210(arg1, arg2, true, arg0);
			if (!local42) {
				local42 = this.method9210(arg1, arg2, false, arg0);
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!vw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt10796;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIZ[BI)Z")
	private boolean method9210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(8) Class243 local8 = this.aClass243_4;
		synchronized (this.aClass243_4) {
			try {
				@Pc(79) int local79;
				if (arg2) {
					if ((long) (arg1 * 6 + 6) > this.aClass243_5.method5980()) {
						return false;
					}
					this.aClass243_5.method5982((long) (arg1 * 6));
					this.aClass243_5.method5981(Static113.aByteArray34, 0, 6);
					local79 = (Static113.aByteArray34[5] & 0xFF) + ((Static113.aByteArray34[3] & 0xFF) << 16) + ((Static113.aByteArray34[4] & 0xFF) << 8);
					if (local79 <= 0 || this.aClass243_4.method5980() / 520L < (long) local79) {
						return false;
					}
				} else {
					local79 = (int) ((this.aClass243_4.method5980() + 519L) / 520L);
					if (local79 == 0) {
						local79 = 1;
					}
				}
				Static113.aByteArray34[4] = (byte) (local79 >> 8);
				Static113.aByteArray34[5] = (byte) local79;
				Static113.aByteArray34[2] = (byte) arg0;
				Static113.aByteArray34[1] = (byte) (arg0 >> 8);
				Static113.aByteArray34[3] = (byte) (local79 >> 16);
				Static113.aByteArray34[0] = (byte) (arg0 >> 16);
				this.aClass243_5.method5982((long) (arg1 * 6));
				this.aClass243_5.method5976(6, Static113.aByteArray34, 0);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (true) {
					if (arg0 > local168) {
						label102: {
							@Pc(176) int local176 = 0;
							@Pc(212) int local212;
							if (arg2) {
								this.aClass243_4.method5982((long) (local79 * 520));
								try {
									this.aClass243_4.method5981(Static113.aByteArray34, 0, 8);
								} catch (@Pc(196) EOFException local196) {
									break label102;
								}
								local212 = (Static113.aByteArray34[1] & 0xFF) + ((Static113.aByteArray34[0] & 0xFF) << 8);
								local176 = ((Static113.aByteArray34[4] & 0xFF) << 16) + (Static113.aByteArray34[5] << 8 & 0xFF00) + (Static113.aByteArray34[6] & 0xFF);
								@Pc(250) int local250 = ((Static113.aByteArray34[2] & 0xFF) << 8) + (Static113.aByteArray34[3] & 0xFF);
								@Pc(256) int local256 = Static113.aByteArray34[7] & 0xFF;
								if (local212 != arg1 || local250 != local170 || this.anInt10796 != local256) {
									return false;
								}
								if (local176 < 0 || this.aClass243_4.method5980() / 520L < (long) local176) {
									return false;
								}
							}
							if (local176 == 0) {
								local176 = (int) ((this.aClass243_4.method5980() + 519L) / 520L);
								arg2 = false;
								if (local176 == 0) {
									local176++;
								}
								if (local176 == local79) {
									local176++;
								}
							}
							Static113.aByteArray34[3] = (byte) local170;
							if (arg0 - local168 <= 512) {
								local176 = 0;
							}
							Static113.aByteArray34[2] = (byte) (local170 >> 8);
							Static113.aByteArray34[0] = (byte) (arg1 >> 8);
							Static113.aByteArray34[1] = (byte) arg1;
							Static113.aByteArray34[4] = (byte) (local176 >> 16);
							Static113.aByteArray34[6] = (byte) local176;
							Static113.aByteArray34[5] = (byte) (local176 >> 8);
							Static113.aByteArray34[7] = (byte) this.anInt10796;
							this.aClass243_4.method5982((long) (local79 * 520));
							this.aClass243_4.method5976(8, Static113.aByteArray34, 0);
							local212 = arg0 - local168;
							if (local212 > 512) {
								local212 = 512;
							}
							this.aClass243_4.method5976(local212, arg3, local168);
							local170++;
							local79 = local176;
							local168 += local212;
							continue;
						}
					}
					@Pc(437) boolean local437 = true;
					return true;
				}
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}
}
