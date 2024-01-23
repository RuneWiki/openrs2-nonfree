import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "Lclient!wn;")
	private static Class182 aClass182_14 = new Class182();

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	public static int anInt3350 = 0;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public static int anInt3351 = 0;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public static int anInt3352 = 0;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "J")
	private static long aLong122 = 0L;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public static int anInt3353 = 0;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Lclient!wn;")
	private static Class182 aClass182_15 = new Class182();

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!wn;")
	private static Class182 aClass182_16 = new Class182();

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!wn;")
	private static Class182 aClass182_17 = new Class182();

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "Lclient!wn;")
	private static Class182 aClass182_18 = new Class182();

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!wn;")
	private static Class182 aClass182_19 = new Class182();

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "[I")
	private static int[] anIntArray255 = new int[1000];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Lclient!a;I)V")
	public static synchronized void method2631(@OriginalArg(0) int arg0, @OriginalArg(1) Class1[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3350) {
			aClass182_18.method4328(new Class8_Sub17(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	public static synchronized void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3350) {
			@Pc(8) Class8_Sub28 local8 = new Class8_Sub28(arg1);
			local8.aLong203 = arg0;
			aClass182_14.method4328(local8);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static synchronized void method2633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3350) {
			@Pc(7) Class8_Sub28 local7 = new Class8_Sub28();
			local7.aLong203 = arg0;
			aClass182_17.method4328(local7);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
	public static synchronized void method2634() {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class8_Sub28 local8 = (Class8_Sub28) aClass182_14.method4326();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray255, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class8_Sub28) aClass182_15.method4326();
					if (local8 == null) {
						while (true) {
							local8 = (Class8_Sub28) aClass182_16.method4326();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray255, 0);
								}
								while (true) {
									local8 = (Class8_Sub28) aClass182_17.method4326();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class8_Sub17 local136 = (Class8_Sub17) aClass182_18.method4326();
											if (local136 == null) {
												while (true) {
													local8 = (Class8_Sub28) aClass182_19.method4326();
													if (local8 == null) {
														if (anInt3353 + anInt3352 + anInt3351 > 100663296 && Static71.method1143() > aLong122 + 60000L) {
															System.gc();
															aLong122 = Static71.method1143();
														}
														return;
													}
													local126 = (int) local8.aLong203;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass1Array1.length; local126++) {
												local1.glDetachObjectARB(local136.anInt2755, local136.aClass1Array1[local126].anInt2);
											}
											local1.glDeleteObjectARB(local136.anInt2755);
										}
									}
									local126 = (int) local8.aLong203;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray255[local3++] = (int) local8.aLong203;
							anInt3351 -= local8.anInt4870;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray255, 0);
								local3 = 0;
							}
						}
					}
					anIntArray255[local3++] = (int) local8.aLong203;
					anInt3352 -= local8.anInt4870;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray255, 0);
						local3 = 0;
					}
				}
			}
			anIntArray255[local3++] = (int) local8.aLong203;
			anInt3353 -= local8.anInt4870;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray255, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
	public static synchronized void method2635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3350) {
			@Pc(7) Class8_Sub28 local7 = new Class8_Sub28();
			local7.aLong203 = arg0;
			aClass182_19.method4328(local7);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
	public static synchronized void method2636() {
		anInt3350++;
		aClass182_14.method4317();
		aClass182_15.method4317();
		aClass182_16.method4317();
		aClass182_17.method4317();
		aClass182_18.method4317();
		aClass182_19.method4317();
		anInt3353 = 0;
		anInt3352 = 0;
		anInt3351 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)V")
	public static synchronized void method2638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3350) {
			@Pc(8) Class8_Sub28 local8 = new Class8_Sub28(arg1);
			local8.aLong203 = arg0;
			aClass182_15.method4328(local8);
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)V")
	public static synchronized void method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3350) {
			@Pc(8) Class8_Sub28 local8 = new Class8_Sub28(arg1);
			local8.aLong203 = arg0;
			aClass182_16.method4328(local8);
		}
	}
}
