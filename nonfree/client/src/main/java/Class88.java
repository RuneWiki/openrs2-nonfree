import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class88 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	private int anInt3984 = 65000;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!hf;")
	private Class37 aClass37_4 = null;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!hf;")
	private Class37 aClass37_5 = null;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	private final int anInt3986;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILclient!hf;Lclient!hf;I)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3) {
		this.anInt3986 = arg0;
		this.aClass37_4 = arg2;
		this.anInt3984 = arg3;
		this.aClass37_5 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3986;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[B")
	public byte[] method2979(@OriginalArg(0) int arg0) {
		@Pc(8) Class37 local8 = this.aClass37_5;
		synchronized (this.aClass37_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass37_4.method1157()) {
					return null;
				}
				this.aClass37_4.method1158((long) (arg0 * 6));
				this.aClass37_4.method1149(0, 6, Static87.aByteArray47);
				@Pc(73) int local73 = (Static87.aByteArray47[5] & 0xFF) + ((Static87.aByteArray47[4] & 0xFF) << 8) + ((Static87.aByteArray47[3] & 0xFF) << 16);
				@Pc(97) int local97 = ((Static87.aByteArray47[0] & 0xFF) << 16) + ((Static87.aByteArray47[1] & 0xFF) << 8) + (Static87.aByteArray47[2] & 0xFF);
				if (local97 < 0 || local97 > this.anInt3984) {
					return null;
				} else if (local73 > 0 && (long) local73 <= this.aClass37_5.method1157() / 520L) {
					@Pc(134) byte[] local134 = new byte[local97];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					label55: while (local97 > local138) {
						if (local73 == 0) {
							return null;
						}
						this.aClass37_5.method1158((long) (local73 * 520));
						@Pc(163) int local163 = local97 - local138;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass37_5.method1149(0, local163 + 8, Static87.aByteArray47);
						@Pc(191) int local191 = (Static87.aByteArray47[1] & 0xFF) + ((Static87.aByteArray47[0] & 0xFF) << 8);
						@Pc(197) int local197 = Static87.aByteArray47[7] & 0xFF;
						@Pc(211) int local211 = ((Static87.aByteArray47[2] & 0xFF) << 8) + (Static87.aByteArray47[3] & 0xFF);
						@Pc(234) int local234 = ((Static87.aByteArray47[5] & 0xFF) << 8) + ((Static87.aByteArray47[4] & 0xFF) << 16) + (Static87.aByteArray47[6] & 0xFF);
						if (arg0 == local191 && local136 == local211 && local197 == this.anInt3986) {
							if (local234 >= 0 && (long) local234 <= this.aClass37_5.method1157() / 520L) {
								local73 = local234;
								local136++;
								@Pc(276) int local276 = 0;
								while (true) {
									if (local163 <= local276) {
										continue label55;
									}
									local134[local138++] = Static87.aByteArray47[local276 + 8];
									local276++;
								}
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(305) IOException local305) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BIII)Z")
	public boolean method2981(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class37 local6 = this.aClass37_5;
		synchronized (this.aClass37_5) {
			if (arg2 < 0 || this.anInt3984 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(28) boolean local28 = this.method2983(true, arg0, arg1, arg2);
			if (!local28) {
				local28 = this.method2983(false, arg0, arg1, arg2);
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method2983(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class37 local8 = this.aClass37_5;
		synchronized (this.aClass37_5) {
			try {
				@Pc(33) int local33;
				if (arg0) {
					if (this.aClass37_4.method1157() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass37_4.method1158((long) (arg2 * 6));
					this.aClass37_4.method1149(0, 6, Static87.aByteArray47);
					local33 = (Static87.aByteArray47[5] & 0xFF) + ((Static87.aByteArray47[3] & 0xFF) << 16) + ((Static87.aByteArray47[4] & 0xFF) << 8);
					if (local33 <= 0 || this.aClass37_5.method1157() / 520L < (long) local33) {
						return false;
					}
				} else {
					local33 = (int) ((this.aClass37_5.method1157() + 519L) / 520L);
					if (local33 == 0) {
						local33 = 1;
					}
				}
				Static87.aByteArray47[2] = (byte) arg3;
				Static87.aByteArray47[5] = (byte) local33;
				@Pc(134) int local134 = 0;
				Static87.aByteArray47[1] = (byte) (arg3 >> 8);
				Static87.aByteArray47[0] = (byte) (arg3 >> 16);
				Static87.aByteArray47[4] = (byte) (local33 >> 8);
				@Pc(157) int local157 = 0;
				Static87.aByteArray47[3] = (byte) (local33 >> 16);
				this.aClass37_4.method1158((long) (arg2 * 6));
				this.aClass37_4.method1155(Static87.aByteArray47, 0, 6);
				while (local134 < arg3) {
					@Pc(183) int local183 = 0;
					@Pc(243) int local243;
					if (arg0) {
						this.aClass37_5.method1158((long) (local33 * 520));
						try {
							this.aClass37_5.method1149(0, 8, Static87.aByteArray47);
						} catch (@Pc(204) EOFException local204) {
							return true;
						}
						local183 = (Static87.aByteArray47[6] & 0xFF) + ((Static87.aByteArray47[4] & 0xFF) << 16) + ((Static87.aByteArray47[5] & 0xFF) << 8);
						local243 = ((Static87.aByteArray47[0] & 0xFF) << 8) + (Static87.aByteArray47[1] & 0xFF);
						@Pc(258) int local258 = ((Static87.aByteArray47[2] & 0xFF) << 8) + (Static87.aByteArray47[3] & 0xFF);
						@Pc(264) int local264 = Static87.aByteArray47[7] & 0xFF;
						if (local243 != arg2 || local157 != local258 || local264 != this.anInt3986) {
							return false;
						}
						if (local183 < 0 || (long) local183 > this.aClass37_5.method1157() / 520L) {
							return false;
						}
					}
					if (local183 == 0) {
						local183 = (int) ((this.aClass37_5.method1157() + 519L) / 520L);
						arg0 = false;
						if (local183 == 0) {
							local183++;
						}
						if (local183 == local33) {
							local183++;
						}
					}
					if (arg3 - local134 <= 512) {
						local183 = 0;
					}
					Static87.aByteArray47[5] = (byte) (local183 >> 8);
					Static87.aByteArray47[6] = (byte) local183;
					Static87.aByteArray47[1] = (byte) arg2;
					Static87.aByteArray47[0] = (byte) (arg2 >> 8);
					Static87.aByteArray47[2] = (byte) (local157 >> 8);
					Static87.aByteArray47[4] = (byte) (local183 >> 16);
					Static87.aByteArray47[3] = (byte) local157;
					Static87.aByteArray47[7] = (byte) this.anInt3986;
					this.aClass37_5.method1158((long) (local33 * 520));
					local33 = local183;
					local157++;
					local243 = arg3 - local134;
					this.aClass37_5.method1155(Static87.aByteArray47, 0, 8);
					if (local243 > 512) {
						local243 = 512;
					}
					this.aClass37_5.method1155(arg1, local134, local243);
					local134 += local243;
				}
				return true;
			} catch (@Pc(443) IOException local443) {
				return false;
			}
		}
	}
}
