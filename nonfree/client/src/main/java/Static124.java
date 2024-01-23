import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt2873 = 0;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "J")
	private static long aLong91 = 0L;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!en;")
	private static Class44 aClass44_12 = new Class44();

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!en;")
	private static Class44 aClass44_13 = new Class44();

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!en;")
	private static Class44 aClass44_14 = new Class44();

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!en;")
	private static Class44 aClass44_15 = new Class44();

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!en;")
	private static Class44 aClass44_16 = new Class44();

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!en;")
	private static Class44 aClass44_17 = new Class44();

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "[I")
	private static int[] anIntArray238 = new int[1000];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static synchronized void method2208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2871) {
			@Pc(7) Class2_Sub25 local7 = new Class2_Sub25();
			local7.aLong214 = arg0;
			aClass44_17.method1358(local7);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
	public static synchronized void method2209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2871) {
			@Pc(8) Class2_Sub25 local8 = new Class2_Sub25(arg1);
			local8.aLong214 = arg0;
			aClass44_13.method1358(local8);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Lclient!ed;I)V")
	public static synchronized void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) Class38[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2871) {
			aClass44_16.method1358(new Class2_Sub23(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()V")
	public static synchronized void method2211() {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class2_Sub25 local8 = (Class2_Sub25) aClass44_12.method1353();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray238, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class2_Sub25) aClass44_13.method1353();
					if (local8 == null) {
						while (true) {
							local8 = (Class2_Sub25) aClass44_14.method1353();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray238, 0);
								}
								while (true) {
									local8 = (Class2_Sub25) aClass44_15.method1353();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class2_Sub23 local136 = (Class2_Sub23) aClass44_16.method1353();
											if (local136 == null) {
												while (true) {
													local8 = (Class2_Sub25) aClass44_17.method1353();
													if (local8 == null) {
														if (anInt2874 + anInt2873 + anInt2872 > 100663296 && Static221.method3670() > aLong91 + 60000L) {
															System.gc();
															aLong91 = Static221.method3670();
														}
														return;
													}
													local126 = (int) local8.aLong214;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass38Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt4447, local136.aClass38Array2[local126].anInt1530);
											}
											local1.glDeleteObjectARB(local136.anInt4447);
										}
									}
									local126 = (int) local8.aLong214;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray238[local3++] = (int) local8.aLong214;
							anInt2872 -= local8.anInt4838;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray238, 0);
								local3 = 0;
							}
						}
					}
					anIntArray238[local3++] = (int) local8.aLong214;
					anInt2873 -= local8.anInt4838;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray238, 0);
						local3 = 0;
					}
				}
			}
			anIntArray238[local3++] = (int) local8.aLong214;
			anInt2874 -= local8.anInt4838;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray238, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
	public static synchronized void method2212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2871) {
			@Pc(8) Class2_Sub25 local8 = new Class2_Sub25(arg1);
			local8.aLong214 = arg0;
			aClass44_14.method1358(local8);
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)V")
	public static synchronized void method2213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt2871) {
			@Pc(8) Class2_Sub25 local8 = new Class2_Sub25(arg1);
			local8.aLong214 = arg0;
			aClass44_12.method1358(local8);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
	public static synchronized void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt2871) {
			@Pc(7) Class2_Sub25 local7 = new Class2_Sub25();
			local7.aLong214 = arg0;
			aClass44_15.method1358(local7);
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	public static synchronized void method2215() {
		anInt2871++;
		aClass44_12.method1361();
		aClass44_13.method1361();
		aClass44_14.method1361();
		aClass44_15.method1361();
		aClass44_16.method1361();
		aClass44_17.method1361();
		anInt2874 = 0;
		anInt2873 = 0;
		anInt2872 = 0;
	}
}
