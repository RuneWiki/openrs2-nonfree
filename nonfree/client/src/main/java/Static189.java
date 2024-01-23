import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	public static int anInt3718 = 0;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public static int anInt3719 = 0;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!fk;")
	private static Class56 aClass56_12 = new Class56();

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "J")
	private static long aLong160 = 0L;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public static int anInt3720 = 0;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	public static int anInt3721 = 0;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Lclient!fk;")
	private static Class56 aClass56_13 = new Class56();

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "Lclient!fk;")
	private static Class56 aClass56_14 = new Class56();

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!fk;")
	private static Class56 aClass56_15 = new Class56();

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!fk;")
	private static Class56 aClass56_16 = new Class56();

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!fk;")
	private static Class56 aClass56_17 = new Class56();

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
	private static int[] anIntArray430 = new int[1000];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public static synchronized void method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3719) {
			@Pc(7) Class3_Sub8 local7 = new Class3_Sub8();
			local7.aLong243 = arg0;
			aClass56_17.method1282(local7);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
	public static synchronized void method3148() {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) aClass56_12.method1279();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray430, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class3_Sub8) aClass56_13.method1279();
					if (local8 == null) {
						while (true) {
							local8 = (Class3_Sub8) aClass56_14.method1279();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray430, 0);
								}
								while (true) {
									local8 = (Class3_Sub8) aClass56_15.method1279();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class3_Sub17 local136 = (Class3_Sub17) aClass56_16.method1279();
											if (local136 == null) {
												while (true) {
													local8 = (Class3_Sub8) aClass56_17.method1279();
													if (local8 == null) {
														if (anInt3718 + anInt3720 + anInt3721 > 100663296 && Static128.method2196() > aLong160 + 60000L) {
															System.gc();
															aLong160 = Static128.method2196();
														}
														return;
													}
													local126 = (int) local8.aLong243;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass185Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt2756, local136.aClass185Array2[local126].anInt5849);
											}
											local1.glDeleteObjectARB(local136.anInt2756);
										}
									}
									local126 = (int) local8.aLong243;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray430[local3++] = (int) local8.aLong243;
							anInt3721 -= local8.anInt1237;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray430, 0);
								local3 = 0;
							}
						}
					}
					anIntArray430[local3++] = (int) local8.aLong243;
					anInt3720 -= local8.anInt1237;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray430, 0);
						local3 = 0;
					}
				}
			}
			anIntArray430[local3++] = (int) local8.aLong243;
			anInt3718 -= local8.anInt1237;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray430, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[Lclient!vg;I)V")
	public static synchronized void method3149(@OriginalArg(0) int arg0, @OriginalArg(1) Class185[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3719) {
			aClass56_16.method1282(new Class3_Sub17(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
	public static synchronized void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3719) {
			@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg1);
			local8.aLong243 = arg0;
			aClass56_14.method1282(local8);
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "()V")
	public static synchronized void method3152() {
		anInt3719++;
		aClass56_12.method1270();
		aClass56_13.method1270();
		aClass56_14.method1270();
		aClass56_15.method1270();
		aClass56_16.method1270();
		aClass56_17.method1270();
		anInt3718 = 0;
		anInt3720 = 0;
		anInt3721 = 0;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
	public static synchronized void method3153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3719) {
			@Pc(7) Class3_Sub8 local7 = new Class3_Sub8();
			local7.aLong243 = arg0;
			aClass56_15.method1282(local7);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V")
	public static synchronized void method3154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3719) {
			@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg1);
			local8.aLong243 = arg0;
			aClass56_13.method1282(local8);
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V")
	public static synchronized void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3719) {
			@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg1);
			local8.aLong243 = arg0;
			aClass56_12.method1282(local8);
		}
	}
}
