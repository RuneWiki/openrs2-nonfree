import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!a;")
	private static Class1 aClass1_25 = new Class1();

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "J")
	private static long aLong259 = 0L;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	public static int anInt5185 = 0;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	public static int anInt5186 = 0;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public static int anInt5187 = 0;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	public static int anInt5188 = 0;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Lclient!a;")
	private static Class1 aClass1_26 = new Class1();

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_27 = new Class1();

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!a;")
	private static Class1 aClass1_28 = new Class1();

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Lclient!a;")
	private static Class1 aClass1_29 = new Class1();

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!a;")
	private static Class1 aClass1_30 = new Class1();

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "[I")
	private static int[] anIntArray470 = new int[1000];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
	public static synchronized void method4121() {
		anInt5185++;
		aClass1_25.method10();
		aClass1_26.method10();
		aClass1_27.method10();
		aClass1_28.method10();
		aClass1_29.method10();
		aClass1_30.method10();
		anInt5187 = 0;
		anInt5186 = 0;
		anInt5188 = 0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	public static synchronized void method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5185) {
			@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(arg1);
			local8.aLong315 = arg0;
			aClass1_26.method11(local8);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[Lclient!sm;I)V")
	public static synchronized void method4124(@OriginalArg(0) int arg0, @OriginalArg(1) Class160[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5185) {
			aClass1_29.method11(new Class2_Sub28(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public static synchronized void method4125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt5185) {
			@Pc(7) Class2_Sub21 local7 = new Class2_Sub21();
			local7.aLong315 = arg0;
			aClass1_30.method11(local7);
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)V")
	public static synchronized void method4126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5185) {
			@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(arg1);
			local8.aLong315 = arg0;
			aClass1_25.method11(local8);
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public static synchronized void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt5185) {
			@Pc(7) Class2_Sub21 local7 = new Class2_Sub21();
			local7.aLong315 = arg0;
			aClass1_28.method11(local7);
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "()V")
	public static synchronized void method4128() {
		@Pc(1) GL local1 = Static60.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class2_Sub21 local8 = (Class2_Sub21) aClass1_25.method3();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray470, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class2_Sub21) aClass1_26.method3();
					if (local8 == null) {
						while (true) {
							local8 = (Class2_Sub21) aClass1_27.method3();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray470, 0);
								}
								while (true) {
									local8 = (Class2_Sub21) aClass1_28.method3();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class2_Sub28 local136 = (Class2_Sub28) aClass1_29.method3();
											if (local136 == null) {
												while (true) {
													local8 = (Class2_Sub21) aClass1_30.method3();
													if (local8 == null) {
														if (anInt5187 + anInt5186 + anInt5188 > 100663296 && Static6.method126() > aLong259 + 60000L) {
															System.gc();
															aLong259 = Static6.method126();
														}
														return;
													}
													local126 = (int) local8.aLong315;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass160Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt5515, local136.aClass160Array2[local126].anInt4909);
											}
											local1.glDeleteObjectARB(local136.anInt5515);
										}
									}
									local126 = (int) local8.aLong315;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray470[local3++] = (int) local8.aLong315;
							anInt5188 -= local8.anInt4234;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray470, 0);
								local3 = 0;
							}
						}
					}
					anIntArray470[local3++] = (int) local8.aLong315;
					anInt5186 -= local8.anInt4234;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray470, 0);
						local3 = 0;
					}
				}
			}
			anIntArray470[local3++] = (int) local8.aLong315;
			anInt5187 -= local8.anInt4234;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray470, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)V")
	public static synchronized void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5185) {
			@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(arg1);
			local8.aLong315 = arg0;
			aClass1_27.method11(local8);
		}
	}
}
