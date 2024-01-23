import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class79 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!qd;")
	private Class137 aClass137_5 = null;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	private int anInt2689 = 65000;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!qd;")
	private Class137 aClass137_6 = null;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(ILclient!qd;Lclient!qd;I)V")
	public Class79(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3) {
		this.anInt2682 = arg0;
		this.anInt2689 = arg3;
		this.aClass137_6 = arg2;
		this.aClass137_5 = arg1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[B")
	public byte[] method2083(@OriginalArg(0) int arg0) {
		@Pc(9) Class137 local9 = this.aClass137_5;
		synchronized (this.aClass137_5) {
			try {
				@Pc(24) Object local24;
				if (this.aClass137_6.method3394() < (long) (arg0 * 6 + 6)) {
					local24 = null;
					return (byte[]) local24;
				}
				this.aClass137_6.method3389((long) (arg0 * 6));
				this.aClass137_6.method3393(0, 6, Static80.aByteArray24);
				@Pc(64) int local64 = (Static80.aByteArray24[2] & 0xFF) + ((Static80.aByteArray24[1] & 0xFF) << 8) + ((Static80.aByteArray24[0] & 0xFF) << 16);
				@Pc(87) int local87 = ((Static80.aByteArray24[4] & 0xFF) << 8) + (((Static80.aByteArray24[3] & 0xFF) << 16) + (Static80.aByteArray24[5] & 0xFF));
				if (local64 < 0 || local64 > this.anInt2689) {
					local24 = null;
					return (byte[]) local24;
				} else if (local87 <= 0 || (long) local87 > this.aClass137_5.method3394() / 520L) {
					local24 = null;
					return (byte[]) local24;
				} else {
					@Pc(125) int local125 = 0;
					@Pc(128) byte[] local128 = new byte[local64];
					@Pc(130) int local130 = 0;
					while (local125 < local64) {
						if (local87 == 0) {
							local24 = null;
							return (byte[]) local24;
						}
						this.aClass137_5.method3389((long) (local87 * 520));
						@Pc(156) int local156 = local64 - local125;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass137_5.method3393(0, local156 + 8, Static80.aByteArray24);
						@Pc(184) int local184 = (Static80.aByteArray24[1] & 0xFF) + ((Static80.aByteArray24[0] & 0xFF) << 8);
						@Pc(207) int local207 = ((Static80.aByteArray24[4] & 0xFF) << 16) + (Static80.aByteArray24[5] << 8 & 0xFF00) + (Static80.aByteArray24[6] & 0xFF);
						@Pc(221) int local221 = (Static80.aByteArray24[3] & 0xFF) + ((Static80.aByteArray24[2] & 0xFF) << 8);
						@Pc(227) int local227 = Static80.aByteArray24[7] & 0xFF;
						if (arg0 != local184 || local130 != local221 || local227 != this.anInt2682) {
							local24 = null;
							return (byte[]) local24;
						}
						if (local207 < 0 || (long) local207 > this.aClass137_5.method3394() / 520L) {
							local24 = null;
							return (byte[]) local24;
						}
						local130++;
						local87 = local207;
						for (@Pc(270) int local270 = 0; local270 < local156; local270++) {
							local128[local125++] = Static80.aByteArray24[local270 + 8];
						}
					}
					@Pc(292) byte[] local292 = local128;
					return local292;
				}
			} catch (@Pc(296) IOException local296) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method2084(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class137 local9 = this.aClass137_5;
		synchronized (this.aClass137_5) {
			try {
				@Pc(22) int local22;
				@Pc(48) boolean local48;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass137_6.method3394()) {
						local48 = false;
						return local48;
					}
					this.aClass137_6.method3389((long) (arg3 * 6));
					this.aClass137_6.method3393(0, 6, Static80.aByteArray24);
					local22 = (Static80.aByteArray24[5] & 0xFF) + ((Static80.aByteArray24[3] & 0xFF) << 16) + ((Static80.aByteArray24[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass137_5.method3394() / 520L) {
						local48 = false;
						return local48;
					}
				} else {
					local22 = (int) ((this.aClass137_5.method3394() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static80.aByteArray24[2] = (byte) arg2;
				Static80.aByteArray24[1] = (byte) (arg2 >> 8);
				Static80.aByteArray24[4] = (byte) (local22 >> 8);
				Static80.aByteArray24[5] = (byte) local22;
				Static80.aByteArray24[3] = (byte) (local22 >> 16);
				Static80.aByteArray24[0] = (byte) (arg2 >> 16);
				this.aClass137_6.method3389((long) (arg3 * 6));
				@Pc(159) int local159 = 0;
				this.aClass137_6.method3398(Static80.aByteArray24, 6, 0);
				@Pc(168) int local168 = 0;
				while (true) {
					if (local159 < arg2) {
						label130: {
							@Pc(177) int local177 = 0;
							@Pc(236) int local236;
							if (arg0) {
								label149: {
									this.aClass137_5.method3389((long) (local22 * 520));
									try {
										this.aClass137_5.method3393(0, 8, Static80.aByteArray24);
									} catch (@Pc(197) EOFException local197) {
										break label130;
									}
									local177 = ((Static80.aByteArray24[5] & 0xFF) << 8) + ((Static80.aByteArray24[4] << 16 & 0xFF0000) + (Static80.aByteArray24[6] & 0xFF));
									local236 = (Static80.aByteArray24[1] & 0xFF) + ((Static80.aByteArray24[0] & 0xFF) << 8);
									@Pc(251) int local251 = ((Static80.aByteArray24[2] & 0xFF) << 8) + (Static80.aByteArray24[3] & 0xFF);
									@Pc(257) int local257 = Static80.aByteArray24[7] & 0xFF;
									if (local236 == arg3 && local168 == local251 && this.anInt2682 == local257) {
										if (local177 >= 0 && this.aClass137_5.method3394() / 520L >= (long) local177) {
											break label149;
										}
										local48 = false;
										return local48;
									}
									local48 = false;
									return local48;
								}
							}
							if (local177 == 0) {
								local177 = (int) ((this.aClass137_5.method3394() + 519L) / 520L);
								arg0 = false;
								if (local177 == 0) {
									local177++;
								}
								if (local177 == local22) {
									local177++;
								}
							}
							Static80.aByteArray24[1] = (byte) arg3;
							if (arg2 - local159 <= 512) {
								local177 = 0;
							}
							Static80.aByteArray24[2] = (byte) (local168 >> 8);
							Static80.aByteArray24[4] = (byte) (local177 >> 16);
							Static80.aByteArray24[3] = (byte) local168;
							Static80.aByteArray24[5] = (byte) (local177 >> 8);
							Static80.aByteArray24[7] = (byte) this.anInt2682;
							local236 = arg2 - local159;
							local168++;
							Static80.aByteArray24[0] = (byte) (arg3 >> 8);
							if (local236 > 512) {
								local236 = 512;
							}
							Static80.aByteArray24[6] = (byte) local177;
							this.aClass137_5.method3389((long) (local22 * 520));
							this.aClass137_5.method3398(Static80.aByteArray24, 8, 0);
							this.aClass137_5.method3398(arg1, local236, local159);
							local22 = local177;
							local159 += local236;
							continue;
						}
					}
					local48 = true;
					return local48;
				}
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III[B)Z")
	public boolean method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) Class137 local12 = this.aClass137_5;
		synchronized (this.aClass137_5) {
			if (arg1 < 0 || arg1 > this.anInt2689) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method2084(true, arg2, arg1, arg0);
			if (!local38) {
				local38 = this.method2084(false, arg2, arg1, arg0);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2682;
	}
}
