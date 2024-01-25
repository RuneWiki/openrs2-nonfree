import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class209 {

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	private int anInt6117 = 65000;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!jk;")
	private Class173 aClass173_6 = null;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!jk;")
	private Class173 aClass173_5 = null;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private final int anInt6121;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(ILclient!jk;Lclient!jk;I)V")
	public Class209(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class173 arg2, @OriginalArg(3) int arg3) {
		this.aClass173_6 = arg2;
		this.anInt6117 = arg3;
		this.anInt6121 = arg0;
		this.aClass173_5 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[B)Z")
	public boolean method5312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class173 local6 = this.aClass173_5;
		synchronized (this.aClass173_5) {
			if (arg1 < 0 || this.anInt6117 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method5313(true, arg1, arg0, arg2);
			if (!local33) {
				local33 = this.method5313(false, arg1, arg0, arg2);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BZII[B)Z")
	private boolean method5313(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class173 local8 = this.aClass173_5;
		synchronized (this.aClass173_5) {
			try {
				@Pc(67) int local67;
				if (arg0) {
					if (this.aClass173_6.method4417() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass173_6.method4421((long) (arg2 * 6));
					this.aClass173_6.method4431(6, 0, Static351.aByteArray71);
					local67 = (Static351.aByteArray71[5] & 0xFF) + ((Static351.aByteArray71[4] & 0xFF) << 8) + ((Static351.aByteArray71[3] & 0xFF) << 16);
					if (local67 <= 0 || this.aClass173_5.method4417() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass173_5.method4417() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static351.aByteArray71[3] = (byte) (local67 >> 16);
				Static351.aByteArray71[0] = (byte) (arg1 >> 16);
				Static351.aByteArray71[4] = (byte) (local67 >> 8);
				Static351.aByteArray71[5] = (byte) local67;
				Static351.aByteArray71[2] = (byte) arg1;
				Static351.aByteArray71[1] = (byte) (arg1 >> 8);
				this.aClass173_6.method4421((long) (arg2 * 6));
				this.aClass173_6.method4418(0, 6, Static351.aByteArray71);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (local168 < arg1) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass173_5.method4421((long) (local67 * 520));
						try {
							this.aClass173_5.method4431(8, 0, Static351.aByteArray71);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static351.aByteArray71[1] & 0xFF) + ((Static351.aByteArray71[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static351.aByteArray71[3] & 0xFF) + ((Static351.aByteArray71[2] & 0xFF) << 8);
						local174 = (Static351.aByteArray71[6] & 0xFF) + ((Static351.aByteArray71[4] & 0xFF) << 16) + ((Static351.aByteArray71[5] & 0xFF) << 8);
						@Pc(252) int local252 = Static351.aByteArray71[7] & 0xFF;
						if (local209 != arg2 || local170 != local223 || local252 != this.anInt6121) {
							return false;
						}
						if (local174 < 0 || (long) local174 > this.aClass173_5.method4417() / 520L) {
							return false;
						}
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass173_5.method4417() + 519L) / 520L);
						arg0 = false;
						if (local174 == 0) {
							local174++;
						}
						if (local67 == local174) {
							local174++;
						}
					}
					Static351.aByteArray71[1] = (byte) arg2;
					Static351.aByteArray71[0] = (byte) (arg2 >> 8);
					Static351.aByteArray71[2] = (byte) (local170 >> 8);
					Static351.aByteArray71[3] = (byte) local170;
					if (arg1 - local168 <= 512) {
						local174 = 0;
					}
					Static351.aByteArray71[7] = (byte) this.anInt6121;
					Static351.aByteArray71[4] = (byte) (local174 >> 16);
					Static351.aByteArray71[6] = (byte) local174;
					Static351.aByteArray71[5] = (byte) (local174 >> 8);
					this.aClass173_5.method4421((long) (local67 * 520));
					this.aClass173_5.method4418(0, 8, Static351.aByteArray71);
					local209 = arg1 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass173_5.method4418(local168, local209, arg3);
					local67 = local174;
					local170++;
					local168 += local209;
				}
				return true;
			} catch (@Pc(430) IOException local430) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[B")
	public byte[] method5314(@OriginalArg(0) int arg0) {
		@Pc(8) Class173 local8 = this.aClass173_5;
		synchronized (this.aClass173_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass173_6.method4417()) {
					return null;
				}
				this.aClass173_6.method4421((long) (arg0 * 6));
				this.aClass173_6.method4431(6, 0, Static351.aByteArray71);
				@Pc(76) int local76 = ((Static351.aByteArray71[1] & 0xFF) << 8) + (Static351.aByteArray71[0] << 16 & 0xFF0000) + (Static351.aByteArray71[2] & 0xFF);
				@Pc(99) int local99 = (Static351.aByteArray71[5] & 0xFF) + ((Static351.aByteArray71[3] & 0xFF) << 16) + ((Static351.aByteArray71[4] & 0xFF) << 8);
				if (local76 < 0 || local76 > this.anInt6117) {
					return null;
				} else if (local99 > 0 && this.aClass173_5.method4417() / 520L >= (long) local99) {
					@Pc(138) byte[] local138 = new byte[local76];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					label55: while (local76 > local140) {
						if (local99 == 0) {
							return null;
						}
						this.aClass173_5.method4421((long) (local99 * 520));
						@Pc(165) int local165 = local76 - local140;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass173_5.method4431(local165 + 8, 0, Static351.aByteArray71);
						@Pc(195) int local195 = ((Static351.aByteArray71[0] & 0xFF) << 8) + (Static351.aByteArray71[1] & 0xFF);
						@Pc(209) int local209 = ((Static351.aByteArray71[2] & 0xFF) << 8) + (Static351.aByteArray71[3] & 0xFF);
						@Pc(232) int local232 = ((Static351.aByteArray71[4] & 0xFF) << 16) + ((Static351.aByteArray71[5] & 0xFF) << 8) + (Static351.aByteArray71[6] & 0xFF);
						@Pc(238) int local238 = Static351.aByteArray71[7] & 0xFF;
						if (local195 == arg0 && local209 == local142 && local238 == this.anInt6121) {
							if (local232 >= 0 && (long) local232 <= this.aClass173_5.method4417() / 520L) {
								local142++;
								local99 = local232;
								@Pc(288) int local288 = 0;
								while (true) {
									if (local288 >= local165) {
										continue label55;
									}
									local138[local140++] = Static351.aByteArray71[local288 + 8];
									local288++;
								}
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6121;
	}
}
