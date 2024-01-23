import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public static int anInt3330 = 0;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt3331 = 0;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public static int anInt3332 = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "J")
	private static long aLong122 = 0L;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!ll;")
	private static Class114 aClass114_18 = new Class114();

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int anInt3333 = 0;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!ll;")
	private static Class114 aClass114_19 = new Class114();

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!ll;")
	private static Class114 aClass114_20 = new Class114();

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!ll;")
	private static Class114 aClass114_21 = new Class114();

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!ll;")
	private static Class114 aClass114_22 = new Class114();

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!ll;")
	private static Class114 aClass114_23 = new Class114();

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
	private static int[] anIntArray319 = new int[1000];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!ec;I)V")
	public static synchronized void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3332) {
			aClass114_22.method2625(new Class4_Sub28(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	public static synchronized void method2729() {
		anInt3332++;
		aClass114_18.method2619();
		aClass114_19.method2619();
		aClass114_20.method2619();
		aClass114_21.method2619();
		aClass114_22.method2619();
		aClass114_23.method2619();
		anInt3331 = 0;
		anInt3333 = 0;
		anInt3330 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static synchronized void method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3332) {
			@Pc(7) Class4_Sub32 local7 = new Class4_Sub32();
			local7.aLong217 = arg0;
			aClass114_21.method2625(local7);
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()V")
	public static synchronized void method2732() {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class4_Sub32 local8 = (Class4_Sub32) aClass114_18.method2621();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray319, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class4_Sub32) aClass114_19.method2621();
					if (local8 == null) {
						while (true) {
							local8 = (Class4_Sub32) aClass114_20.method2621();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray319, 0);
								}
								while (true) {
									local8 = (Class4_Sub32) aClass114_21.method2621();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class4_Sub28 local136 = (Class4_Sub28) aClass114_22.method2621();
											if (local136 == null) {
												while (true) {
													local8 = (Class4_Sub32) aClass114_23.method2621();
													if (local8 == null) {
														if (anInt3331 + anInt3333 + anInt3330 > 100663296 && Static101.method1677() > aLong122 + 60000L) {
															System.gc();
															aLong122 = Static101.method1677();
														}
														return;
													}
													local126 = (int) local8.aLong217;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass43Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt4718, local136.aClass43Array2[local126].anInt1199);
											}
											local1.glDeleteObjectARB(local136.anInt4718);
										}
									}
									local126 = (int) local8.aLong217;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray319[local3++] = (int) local8.aLong217;
							anInt3330 -= local8.anInt5435;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray319, 0);
								local3 = 0;
							}
						}
					}
					anIntArray319[local3++] = (int) local8.aLong217;
					anInt3333 -= local8.anInt5435;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray319, 0);
						local3 = 0;
					}
				}
			}
			anIntArray319[local3++] = (int) local8.aLong217;
			anInt3331 -= local8.anInt5435;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray319, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public static synchronized void method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3332) {
			@Pc(8) Class4_Sub32 local8 = new Class4_Sub32(arg1);
			local8.aLong217 = arg0;
			aClass114_20.method2625(local8);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V")
	public static synchronized void method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3332) {
			@Pc(8) Class4_Sub32 local8 = new Class4_Sub32(arg1);
			local8.aLong217 = arg0;
			aClass114_18.method2625(local8);
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V")
	public static synchronized void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt3332) {
			@Pc(8) Class4_Sub32 local8 = new Class4_Sub32(arg1);
			local8.aLong217 = arg0;
			aClass114_19.method2625(local8);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
	public static synchronized void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt3332) {
			@Pc(7) Class4_Sub32 local7 = new Class4_Sub32();
			local7.aLong217 = arg0;
			aClass114_23.method2625(local7);
		}
	}
}
