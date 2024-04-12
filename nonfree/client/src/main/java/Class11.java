import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class11 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	public static int[] anIntArray80 = new int[99];

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	public static int[] anIntArray79 = new int[50];

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_82 = Static12.method257("Enter name of player to delete from list");

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_83 = Static12.method257(" @yel@");

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int anInt309;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array6;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private int anInt301 = 65000;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!d;")
	private Class14 aClass14_2 = null;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!d;")
	private Class14 aClass14_3 = null;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	private final int anInt297;

	@OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
	@Override
	public String toString() {
		return "Cache:" + this.anInt297;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ[BII)Z", line = 166)
	private boolean method258(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class14 local8 = this.aClass14_3;
		synchronized (this.aClass14_3) {
			try {
				@Pc(27) int local27;
				if (arg1) {
					if (this.aClass14_2.method351() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass14_2.method346((long) (arg3 * 6));
					this.aClass14_2.method350(0, 6, Class2_Sub2_Sub12_Sub5.aByteArray17);
					local27 = (Class2_Sub2_Sub12_Sub5.aByteArray17[5] & 0xFF) + (((Class2_Sub2_Sub12_Sub5.aByteArray17[3] & 0xFF) << 16) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[4] & 0xFF) << 8));
					if (local27 <= 0 || this.aClass14_3.method351() / 520L < (long) local27) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass14_3.method351() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Class2_Sub2_Sub12_Sub5.aByteArray17[0] = (byte) (arg0 >> 16);
				@Pc(121) int local121 = 0;
				@Pc(123) int local123 = 0;
				Class2_Sub2_Sub12_Sub5.aByteArray17[1] = (byte) (arg0 >> 8);
				Class2_Sub2_Sub12_Sub5.aByteArray17[2] = (byte) arg0;
				Class2_Sub2_Sub12_Sub5.aByteArray17[3] = (byte) (local27 >> 16);
				Class2_Sub2_Sub12_Sub5.aByteArray17[4] = (byte) (local27 >> 8);
				Class2_Sub2_Sub12_Sub5.aByteArray17[5] = (byte) local27;
				this.aClass14_2.method346((long) (arg3 * 6));
				this.aClass14_2.method348(Class2_Sub2_Sub12_Sub5.aByteArray17, 6, 0);
				while (local121 < arg0) {
					@Pc(175) int local175 = 0;
					@Pc(233) int local233;
					if (arg1) {
						this.aClass14_3.method346((long) (local27 * 520));
						try {
							this.aClass14_3.method350(0, 8, Class2_Sub2_Sub12_Sub5.aByteArray17);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local175 = (Class2_Sub2_Sub12_Sub5.aByteArray17[6] & 0xFF) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[4] & 0xFF) << 16) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[5] & 0xFF) << 8);
						local233 = (Class2_Sub2_Sub12_Sub5.aByteArray17[1] & 0xFF) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[0] & 0xFF) << 8);
						@Pc(239) int local239 = Class2_Sub2_Sub12_Sub5.aByteArray17[7] & 0xFF;
						@Pc(253) int local253 = ((Class2_Sub2_Sub12_Sub5.aByteArray17[2] & 0xFF) << 8) + (Class2_Sub2_Sub12_Sub5.aByteArray17[3] & 0xFF);
						if (local233 != arg3 || local253 != local123 || local239 != this.anInt297) {
							return false;
						}
						if (local175 < 0 || this.aClass14_3.method351() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg1 = false;
						local175 = (int) ((this.aClass14_3.method351() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local27 == local175) {
							local175++;
						}
					}
					Class2_Sub2_Sub12_Sub5.aByteArray17[0] = (byte) (arg3 >> 8);
					Class2_Sub2_Sub12_Sub5.aByteArray17[1] = (byte) arg3;
					Class2_Sub2_Sub12_Sub5.aByteArray17[2] = (byte) (local123 >> 8);
					Class2_Sub2_Sub12_Sub5.aByteArray17[3] = (byte) local123;
					local123++;
					if (arg0 - local121 <= 512) {
						local175 = 0;
					}
					local233 = arg0 - local121;
					Class2_Sub2_Sub12_Sub5.aByteArray17[4] = (byte) (local175 >> 16);
					Class2_Sub2_Sub12_Sub5.aByteArray17[5] = (byte) (local175 >> 8);
					if (local233 > 512) {
						local233 = 512;
					}
					Class2_Sub2_Sub12_Sub5.aByteArray17[6] = (byte) local175;
					Class2_Sub2_Sub12_Sub5.aByteArray17[7] = (byte) this.anInt297;
					this.aClass14_3.method346((long) (local27 * 520));
					local27 = local175;
					this.aClass14_3.method348(Class2_Sub2_Sub12_Sub5.aByteArray17, 8, 0);
					this.aClass14_3.method348(arg2, local233, local121);
					local121 += local233;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BZ)Z", line = 285)
	public boolean method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class14 local6 = this.aClass14_3;
		synchronized (this.aClass14_3) {
			if (arg0 < 0 || this.anInt301 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(42) boolean local42 = this.method258(arg0, true, arg2, arg1);
			if (!local42) {
				local42 = this.method258(arg0, false, arg2, arg1);
			}
			return local42;
		}
	}

	static {
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 99; local19++) {
			@Pc(24) int local24 = local19 + 1;
			@Pc(37) int local37 = (int) ((double) local24 + Math.pow(2.0D, (double) local24 / 7.0D) * 300.0D);
			local17 += local37;
			anIntArray80[local19] = local17 / 4;
		}
		anInt308 = 0;
		anInt309 = 0;
		aClass40Array6 = new Class40[5];
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILclient!d;Lclient!d;I)V", line = 356)
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3) {
		this.anInt301 = arg3;
		this.aClass14_2 = arg2;
		this.anInt297 = arg0;
		this.aClass14_3 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[B", line = 394)
	public byte[] method261(@OriginalArg(0) int arg0) {
		@Pc(8) Class14 local8 = this.aClass14_3;
		synchronized (this.aClass14_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass14_2.method351()) {
					return null;
				}
				this.aClass14_2.method346((long) (arg0 * 6));
				this.aClass14_2.method350(0, 6, Class2_Sub2_Sub12_Sub5.aByteArray17);
				@Pc(72) int local72 = ((Class2_Sub2_Sub12_Sub5.aByteArray17[0] & 0xFF) << 16) - (-((Class2_Sub2_Sub12_Sub5.aByteArray17[1] & 0xFF) << 8) - (Class2_Sub2_Sub12_Sub5.aByteArray17[2] & 0xFF));
				@Pc(94) int local94 = ((Class2_Sub2_Sub12_Sub5.aByteArray17[4] & 0xFF) << 8) + (Class2_Sub2_Sub12_Sub5.aByteArray17[3] << 16 & 0xFF0000) + (Class2_Sub2_Sub12_Sub5.aByteArray17[5] & 0xFF);
				if (local72 < 0 || local72 > this.anInt301) {
					return null;
				} else if (local94 > 0 && this.aClass14_3.method351() / 520L >= (long) local94) {
					@Pc(135) byte[] local135 = new byte[local72];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					label55: while (local72 > local139) {
						if (local94 == 0) {
							return null;
						}
						@Pc(153) int local153 = local72 - local139;
						this.aClass14_3.method346((long) (local94 * 520));
						if (local153 > 512) {
							local153 = 512;
						}
						this.aClass14_3.method350(0, local153 + 8, Class2_Sub2_Sub12_Sub5.aByteArray17);
						@Pc(200) int local200 = (Class2_Sub2_Sub12_Sub5.aByteArray17[6] & 0xFF) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[4] & 0xFF) << 16) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[5] & 0xFF) << 8);
						@Pc(214) int local214 = (Class2_Sub2_Sub12_Sub5.aByteArray17[3] & 0xFF) + ((Class2_Sub2_Sub12_Sub5.aByteArray17[2] & 0xFF) << 8);
						@Pc(220) int local220 = Class2_Sub2_Sub12_Sub5.aByteArray17[7] & 0xFF;
						@Pc(235) int local235 = ((Class2_Sub2_Sub12_Sub5.aByteArray17[0] & 0xFF) << 8) + (Class2_Sub2_Sub12_Sub5.aByteArray17[1] & 0xFF);
						if (arg0 == local235 && local137 == local214 && this.anInt297 == local220) {
							if (local200 >= 0 && this.aClass14_3.method351() / 520L >= (long) local200) {
								local137++;
								local94 = local200;
								@Pc(286) int local286 = 0;
								while (true) {
									if (local153 <= local286) {
										continue label55;
									}
									local135[local139++] = Class2_Sub2_Sub12_Sub5.aByteArray17[local286 + 8];
									local286++;
								}
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
}
