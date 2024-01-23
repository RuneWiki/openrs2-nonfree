import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt2463 = 0;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "J")
	private static long aLong83 = 0L;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!ci;")
	private static Class26 aClass26_17 = new Class26();

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static int anInt2464 = 0;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int anInt2465 = 0;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public static int anInt2466 = 0;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!ci;")
	private static Class26 aClass26_18 = new Class26();

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!ci;")
	private static Class26 aClass26_19 = new Class26();

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!ci;")
	private static Class26 aClass26_20 = new Class26();

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!ci;")
	private static Class26 aClass26_21 = new Class26();

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!ci;")
	private static Class26 aClass26_22 = new Class26();

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
	private static int[] anIntArray258 = new int[1000];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public static synchronized void method1829() {
		anInt2464++;
		aClass26_17.method667();
		aClass26_18.method667();
		aClass26_19.method667();
		aClass26_20.method667();
		aClass26_21.method667();
		aClass26_22.method667();
		anInt2463 = 0;
		anInt2466 = 0;
		anInt2465 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static synchronized void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2464) {
			@Pc(7) Class1_Sub17 local7 = new Class1_Sub17();
			local7.aLong247 = arg0;
			aClass26_22.method668(local7);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public static synchronized void method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2464) {
			@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg1);
			local8.aLong247 = arg0;
			aClass26_17.method668(local8);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
	public static synchronized void method1833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2464) {
			@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg1);
			local8.aLong247 = arg0;
			aClass26_18.method668(local8);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
	public static synchronized void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2464) {
			@Pc(7) Class1_Sub17 local7 = new Class1_Sub17();
			local7.aLong247 = arg0;
			aClass26_20.method668(local7);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lclient!ul;I)V")
	public static synchronized void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) Class175[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2464) {
			aClass26_21.method668(new Class1_Sub25(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
	public static synchronized void method1836() {
		@Pc(1) GL local1 = Static294.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub17 local8 = (Class1_Sub17) aClass26_17.method673();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray258, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub17) aClass26_18.method673();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub17) aClass26_19.method673();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray258, 0);
								}
								while (true) {
									local8 = (Class1_Sub17) aClass26_20.method673();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub25 local136 = (Class1_Sub25) aClass26_21.method673();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub17) aClass26_22.method673();
													if (local8 == null) {
														if (anInt2463 + anInt2466 + anInt2465 > 100663296 && Static258.method3967() > aLong83 + 60000L) {
															System.gc();
															aLong83 = Static258.method3967();
														}
														return;
													}
													local126 = (int) local8.aLong247;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass175Array1.length; local126++) {
												local1.glDetachObjectARB(local136.anInt5127, local136.aClass175Array1[local126].anInt5733);
											}
											local1.glDeleteObjectARB(local136.anInt5127);
										}
									}
									local126 = (int) local8.aLong247;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray258[local3++] = (int) local8.aLong247;
							anInt2465 -= local8.anInt3669;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray258, 0);
								local3 = 0;
							}
						}
					}
					anIntArray258[local3++] = (int) local8.aLong247;
					anInt2466 -= local8.anInt3669;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray258, 0);
						local3 = 0;
					}
				}
			}
			anIntArray258[local3++] = (int) local8.aLong247;
			anInt2463 -= local8.anInt3669;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray258, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V")
	public static synchronized void method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2464) {
			@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg1);
			local8.aLong247 = arg0;
			aClass26_19.method668(local8);
		}
	}
}
