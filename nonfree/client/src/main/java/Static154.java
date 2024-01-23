import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt2852 = 0;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "J")
	private static long aLong97 = 0L;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!hh;")
	private static Class69 aClass69_13 = new Class69();

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	public static int anInt2854 = 0;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	public static int anInt2855 = 0;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!hh;")
	private static Class69 aClass69_14 = new Class69();

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!hh;")
	private static Class69 aClass69_15 = new Class69();

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!hh;")
	private static Class69 aClass69_16 = new Class69();

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!hh;")
	private static Class69 aClass69_17 = new Class69();

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!hh;")
	private static Class69 aClass69_18 = new Class69();

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "[I")
	private static int[] anIntArray351 = new int[1000];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	public static synchronized void method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2852) {
			@Pc(8) Class1_Sub30 local8 = new Class1_Sub30(arg1);
			local8.aLong202 = arg0;
			aClass69_14.method1628(local8);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
	public static synchronized void method2371() {
		anInt2852++;
		aClass69_13.method1629();
		aClass69_14.method1629();
		aClass69_15.method1629();
		aClass69_16.method1629();
		aClass69_17.method1629();
		aClass69_18.method1629();
		anInt2853 = 0;
		anInt2854 = 0;
		anInt2855 = 0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[Lclient!dn;I)V")
	public static synchronized void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2852) {
			aClass69_17.method1628(new Class1_Sub13(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
	public static synchronized void method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2852) {
			@Pc(8) Class1_Sub30 local8 = new Class1_Sub30(arg1);
			local8.aLong202 = arg0;
			aClass69_15.method1628(local8);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "()V")
	public static synchronized void method2375() {
		@Pc(1) GL local1 = Static240.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub30 local8 = (Class1_Sub30) aClass69_13.method1630();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray351, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub30) aClass69_14.method1630();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub30) aClass69_15.method1630();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray351, 0);
								}
								while (true) {
									local8 = (Class1_Sub30) aClass69_16.method1630();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub13 local136 = (Class1_Sub13) aClass69_17.method1630();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub30) aClass69_18.method1630();
													if (local8 == null) {
														if (anInt2853 + anInt2854 + anInt2855 > 100663296 && Static252.method3964() > aLong97 + 60000L) {
															System.gc();
															aLong97 = Static252.method3964();
														}
														return;
													}
													local126 = (int) local8.aLong202;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass41Array1.length; local126++) {
												local1.glDetachObjectARB(local136.anInt1889, local136.aClass41Array1[local126].anInt1233);
											}
											local1.glDeleteObjectARB(local136.anInt1889);
										}
									}
									local126 = (int) local8.aLong202;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray351[local3++] = (int) local8.aLong202;
							anInt2855 -= local8.anInt5344;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray351, 0);
								local3 = 0;
							}
						}
					}
					anIntArray351[local3++] = (int) local8.aLong202;
					anInt2854 -= local8.anInt5344;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray351, 0);
						local3 = 0;
					}
				}
			}
			anIntArray351[local3++] = (int) local8.aLong202;
			anInt2853 -= local8.anInt5344;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray351, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)V")
	public static synchronized void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2852) {
			@Pc(8) Class1_Sub30 local8 = new Class1_Sub30(arg1);
			local8.aLong202 = arg0;
			aClass69_13.method1628(local8);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public static synchronized void method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2852) {
			@Pc(7) Class1_Sub30 local7 = new Class1_Sub30();
			local7.aLong202 = arg0;
			aClass69_18.method1628(local7);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
	public static synchronized void method2378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2852) {
			@Pc(7) Class1_Sub30 local7 = new Class1_Sub30();
			local7.aLong202 = arg0;
			aClass69_16.method1628(local7);
		}
	}
}
