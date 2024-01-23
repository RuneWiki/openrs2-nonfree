import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static int anInt4725 = 0;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Lclient!c;")
	private static Class17 aClass17_20 = new Class17();

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	public static int anInt4726 = 0;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public static int anInt4727 = 0;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public static int anInt4728 = 0;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "J")
	private static long aLong163 = 0L;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!c;")
	private static Class17 aClass17_21 = new Class17();

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!c;")
	private static Class17 aClass17_22 = new Class17();

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!c;")
	private static Class17 aClass17_23 = new Class17();

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!c;")
	private static Class17 aClass17_24 = new Class17();

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!c;")
	private static Class17 aClass17_25 = new Class17();

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "[I")
	private static int[] anIntArray378 = new int[1000];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	public static synchronized void method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt4726) {
			@Pc(8) Class4_Sub25 local8 = new Class4_Sub25(arg1);
			local8.aLong211 = arg0;
			aClass17_21.method619(local8);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static synchronized void method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt4726) {
			@Pc(7) Class4_Sub25 local7 = new Class4_Sub25();
			local7.aLong211 = arg0;
			aClass17_25.method619(local7);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	public static synchronized void method3677() {
		@Pc(1) GL local1 = Static251.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class4_Sub25 local8 = (Class4_Sub25) aClass17_20.method617();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray378, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class4_Sub25) aClass17_21.method617();
					if (local8 == null) {
						while (true) {
							local8 = (Class4_Sub25) aClass17_22.method617();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray378, 0);
								}
								while (true) {
									local8 = (Class4_Sub25) aClass17_23.method617();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class4_Sub29 local136 = (Class4_Sub29) aClass17_24.method617();
											if (local136 == null) {
												while (true) {
													local8 = (Class4_Sub25) aClass17_25.method617();
													if (local8 == null) {
														if (anInt4727 + anInt4725 + anInt4728 > 100663296 && Static61.method1150() > aLong163 + 60000L) {
															System.gc();
															aLong163 = Static61.method1150();
														}
														return;
													}
													local126 = (int) local8.aLong211;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass41Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt4990, local136.aClass41Array2[local126].anInt1363);
											}
											local1.glDeleteObjectARB(local136.anInt4990);
										}
									}
									local126 = (int) local8.aLong211;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray378[local3++] = (int) local8.aLong211;
							anInt4728 -= local8.anInt3892;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray378, 0);
								local3 = 0;
							}
						}
					}
					anIntArray378[local3++] = (int) local8.aLong211;
					anInt4725 -= local8.anInt3892;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray378, 0);
						local3 = 0;
					}
				}
			}
			anIntArray378[local3++] = (int) local8.aLong211;
			anInt4727 -= local8.anInt3892;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray378, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	public static synchronized void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt4726) {
			@Pc(8) Class4_Sub25 local8 = new Class4_Sub25(arg1);
			local8.aLong211 = arg0;
			aClass17_22.method619(local8);
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(III)V")
	public static synchronized void method3680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt4726) {
			@Pc(8) Class4_Sub25 local8 = new Class4_Sub25(arg1);
			local8.aLong211 = arg0;
			aClass17_20.method619(local8);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	public static synchronized void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt4726) {
			@Pc(7) Class4_Sub25 local7 = new Class4_Sub25();
			local7.aLong211 = arg0;
			aClass17_23.method619(local7);
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
	public static synchronized void method3682() {
		anInt4726++;
		aClass17_20.method618();
		aClass17_21.method618();
		aClass17_22.method618();
		aClass17_23.method618();
		aClass17_24.method618();
		aClass17_25.method618();
		anInt4727 = 0;
		anInt4725 = 0;
		anInt4728 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Lclient!ef;I)V")
	public static synchronized void method3683(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt4726) {
			aClass17_24.method619(new Class4_Sub29(arg0, arg1));
		}
	}
}
