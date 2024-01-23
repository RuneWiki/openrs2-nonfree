import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Lclient!jo;")
	private static Class96 aClass96_10 = new Class96();

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public static int anInt3244 = 0;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "J")
	private static long aLong117 = 0L;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public static int anInt3245 = 0;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public static int anInt3246 = 0;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	public static int anInt3247 = 0;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!jo;")
	private static Class96 aClass96_11 = new Class96();

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Lclient!jo;")
	private static Class96 aClass96_12 = new Class96();

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!jo;")
	private static Class96 aClass96_13 = new Class96();

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!jo;")
	private static Class96 aClass96_14 = new Class96();

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "Lclient!jo;")
	private static Class96 aClass96_15 = new Class96();

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "[I")
	private static int[] anIntArray292 = new int[1000];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public static synchronized void method2793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3245) {
			@Pc(8) Class1_Sub22 local8 = new Class1_Sub22(arg1);
			local8.aLong210 = arg0;
			aClass96_11.method2336(local8);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
	public static synchronized void method2794() {
		anInt3245++;
		aClass96_10.method2341();
		aClass96_11.method2341();
		aClass96_12.method2341();
		aClass96_13.method2341();
		aClass96_14.method2341();
		aClass96_15.method2341();
		anInt3244 = 0;
		anInt3247 = 0;
		anInt3246 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()V")
	public static synchronized void method2795() {
		@Pc(1) GL local1 = Static71.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) aClass96_10.method2339();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray292, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub22) aClass96_11.method2339();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub22) aClass96_12.method2339();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray292, 0);
								}
								while (true) {
									local8 = (Class1_Sub22) aClass96_13.method2339();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub10 local136 = (Class1_Sub10) aClass96_14.method2339();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub22) aClass96_15.method2339();
													if (local8 == null) {
														if (anInt3244 + anInt3247 + anInt3246 > 100663296 && Static244.method3859() > aLong117 + 60000L) {
															System.gc();
															aLong117 = Static244.method3859();
														}
														return;
													}
													local126 = (int) local8.aLong210;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass113Array1.length; local126++) {
												local1.glDetachObjectARB(local136.anInt1273, local136.aClass113Array1[local126].anInt3426);
											}
											local1.glDeleteObjectARB(local136.anInt1273);
										}
									}
									local126 = (int) local8.aLong210;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray292[local3++] = (int) local8.aLong210;
							anInt3246 -= local8.anInt3973;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray292, 0);
								local3 = 0;
							}
						}
					}
					anIntArray292[local3++] = (int) local8.aLong210;
					anInt3247 -= local8.anInt3973;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray292, 0);
						local3 = 0;
					}
				}
			}
			anIntArray292[local3++] = (int) local8.aLong210;
			anInt3244 -= local8.anInt3973;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray292, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[Lclient!mo;I)V")
	public static synchronized void method2796(@OriginalArg(0) int arg0, @OriginalArg(1) Class113[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3245) {
			aClass96_14.method2336(new Class1_Sub10(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public static synchronized void method2797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3245) {
			@Pc(7) Class1_Sub22 local7 = new Class1_Sub22();
			local7.aLong210 = arg0;
			aClass96_13.method2336(local7);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V")
	public static synchronized void method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3245) {
			@Pc(8) Class1_Sub22 local8 = new Class1_Sub22(arg1);
			local8.aLong210 = arg0;
			aClass96_10.method2336(local8);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(III)V")
	public static synchronized void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3245) {
			@Pc(8) Class1_Sub22 local8 = new Class1_Sub22(arg1);
			local8.aLong210 = arg0;
			aClass96_12.method2336(local8);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
	public static synchronized void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3245) {
			@Pc(7) Class1_Sub22 local7 = new Class1_Sub22();
			local7.aLong210 = arg0;
			aClass96_15.method2336(local7);
		}
	}
}
