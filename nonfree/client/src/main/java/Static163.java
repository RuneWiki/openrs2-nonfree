import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "J")
	private static long aLong114 = 0L;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt3218 = 0;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public static int anInt3219 = 0;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!an;")
	private static Class10 aClass10_33 = new Class10();

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public static int anInt3220 = 0;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static int anInt3221 = 0;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!an;")
	private static Class10 aClass10_34 = new Class10();

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!an;")
	private static Class10 aClass10_35 = new Class10();

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!an;")
	private static Class10 aClass10_36 = new Class10();

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!an;")
	private static Class10 aClass10_37 = new Class10();

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!an;")
	private static Class10 aClass10_38 = new Class10();

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
	private static int[] anIntArray287 = new int[1000];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static synchronized void method2523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3218) {
			@Pc(8) Class4_Sub19 local8 = new Class4_Sub19(arg1);
			local8.aLong200 = arg0;
			aClass10_35.method184(local8);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V")
	public static synchronized void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3218) {
			@Pc(8) Class4_Sub19 local8 = new Class4_Sub19(arg1);
			local8.aLong200 = arg0;
			aClass10_33.method184(local8);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
	private static synchronized void method2525() {
		anInt3218++;
		aClass10_33.method192();
		aClass10_34.method192();
		aClass10_35.method192();
		aClass10_36.method192();
		aClass10_37.method192();
		aClass10_38.method192();
		anInt3219 = 0;
		anInt3220 = 0;
		anInt3221 = 0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[Lclient!ae;I)V")
	public static synchronized void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3218) {
			aClass10_37.method184(new Class4_Sub5(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()V")
	public static synchronized void method2527() {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class4_Sub19 local8 = (Class4_Sub19) aClass10_33.method182();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray287, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class4_Sub19) aClass10_34.method182();
					if (local8 == null) {
						while (true) {
							local8 = (Class4_Sub19) aClass10_35.method182();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray287, 0);
								}
								while (true) {
									local8 = (Class4_Sub19) aClass10_36.method182();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class4_Sub5 local136 = (Class4_Sub5) aClass10_37.method182();
											if (local136 == null) {
												while (true) {
													local8 = (Class4_Sub19) aClass10_38.method182();
													if (local8 == null) {
														if (anInt3219 + anInt3220 + anInt3221 > 100663296 && Static133.method2163() > aLong114 + 60000L) {
															System.gc();
															aLong114 = Static133.method2163();
														}
														return;
													}
													local126 = (int) local8.aLong200;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass5Array1.length; local126++) {
												local1.glDetachObjectARB(local136.anInt304, local136.aClass5Array1[local126].anInt76);
											}
											local1.glDeleteObjectARB(local136.anInt304);
										}
									}
									local126 = (int) local8.aLong200;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray287[local3++] = (int) local8.aLong200;
							anInt3221 -= local8.anInt2869;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray287, 0);
								local3 = 0;
							}
						}
					}
					anIntArray287[local3++] = (int) local8.aLong200;
					anInt3220 -= local8.anInt2869;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray287, 0);
						local3 = 0;
					}
				}
			}
			anIntArray287[local3++] = (int) local8.aLong200;
			anInt3219 -= local8.anInt2869;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray287, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	public static synchronized void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3218) {
			@Pc(7) Class4_Sub19 local7 = new Class4_Sub19();
			local7.aLong200 = arg0;
			aClass10_36.method184(local7);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	public static synchronized void method2529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3218) {
			@Pc(7) Class4_Sub19 local7 = new Class4_Sub19();
			local7.aLong200 = arg0;
			aClass10_38.method184(local7);
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
	public static void method2530() {
		aClass10_33 = null;
		aClass10_34 = null;
		aClass10_35 = null;
		aClass10_36 = null;
		aClass10_37 = null;
		aClass10_38 = null;
		anIntArray287 = null;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(III)V")
	public static synchronized void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3218) {
			@Pc(8) Class4_Sub19 local8 = new Class4_Sub19(arg1);
			local8.aLong200 = arg0;
			aClass10_34.method184(local8);
		}
	}
}
