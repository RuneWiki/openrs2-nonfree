import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public static int anInt1416 = 0;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public static int anInt1417 = 0;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static int anInt1418 = 0;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!bo;")
	private static Class24 aClass24_7 = new Class24();

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "J")
	private static long aLong62 = 0L;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt1419 = 0;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!bo;")
	private static Class24 aClass24_8 = new Class24();

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Lclient!bo;")
	private static Class24 aClass24_9 = new Class24();

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!bo;")
	private static Class24 aClass24_10 = new Class24();

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "Lclient!bo;")
	private static Class24 aClass24_11 = new Class24();

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!bo;")
	private static Class24 aClass24_12 = new Class24();

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	private static int[] anIntArray113 = new int[1000];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public static synchronized void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1419) {
			@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg1);
			local8.aLong223 = arg0;
			aClass24_8.method473(local8);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	public static synchronized void method1188() {
		anInt1419++;
		aClass24_7.method462();
		aClass24_8.method462();
		aClass24_9.method462();
		aClass24_10.method462();
		aClass24_11.method462();
		aClass24_12.method462();
		anInt1416 = 0;
		anInt1417 = 0;
		anInt1418 = 0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	public static synchronized void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1419) {
			@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg1);
			local8.aLong223 = arg0;
			aClass24_9.method473(local8);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	public static synchronized void method1190() {
		@Pc(1) GL local1 = Static291.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub13 local8 = (Class1_Sub13) aClass24_7.method469();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray113, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub13) aClass24_8.method469();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub13) aClass24_9.method469();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray113, 0);
								}
								while (true) {
									local8 = (Class1_Sub13) aClass24_10.method469();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub27 local136 = (Class1_Sub27) aClass24_11.method469();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub13) aClass24_12.method469();
													if (local8 == null) {
														if (anInt1416 + anInt1417 + anInt1418 > 100663296 && Static135.method2186() > aLong62 + 60000L) {
															System.gc();
															aLong62 = Static135.method2186();
														}
														return;
													}
													local126 = (int) local8.aLong223;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass4Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt4827, local136.aClass4Array2[local126].anInt55);
											}
											local1.glDeleteObjectARB(local136.anInt4827);
										}
									}
									local126 = (int) local8.aLong223;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray113[local3++] = (int) local8.aLong223;
							anInt1418 -= local8.anInt2852;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray113, 0);
								local3 = 0;
							}
						}
					}
					anIntArray113[local3++] = (int) local8.aLong223;
					anInt1417 -= local8.anInt2852;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray113, 0);
						local3 = 0;
					}
				}
			}
			anIntArray113[local3++] = (int) local8.aLong223;
			anInt1416 -= local8.anInt2852;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray113, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static synchronized void method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt1419) {
			@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
			local7.aLong223 = arg0;
			aClass24_10.method473(local7);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public static synchronized void method1192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt1419) {
			@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
			local7.aLong223 = arg0;
			aClass24_12.method473(local7);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[Lclient!ac;I)V")
	public static synchronized void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1419) {
			aClass24_11.method473(new Class1_Sub27(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
	public static synchronized void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1419) {
			@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg1);
			local8.aLong223 = arg0;
			aClass24_7.method473(local8);
		}
	}
}
