import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt5213 = 0;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "J")
	private static long aLong169 = 0L;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt5214 = 0;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public static int anInt5215 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt5216 = 0;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!qg;")
	private static Class131 aClass131_18 = new Class131();

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!qg;")
	private static Class131 aClass131_19 = new Class131();

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!qg;")
	private static Class131 aClass131_20 = new Class131();

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!qg;")
	private static Class131 aClass131_21 = new Class131();

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!qg;")
	private static Class131 aClass131_22 = new Class131();

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!qg;")
	private static Class131 aClass131_23 = new Class131();

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
	private static int[] anIntArray539 = new int[1000];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	public static synchronized void method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5216) {
			@Pc(8) Class1_Sub10 local8 = new Class1_Sub10(arg1);
			local8.aLong201 = arg0;
			aClass131_20.method3799(local8);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public static synchronized void method4090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt5216) {
			@Pc(7) Class1_Sub10 local7 = new Class1_Sub10();
			local7.aLong201 = arg0;
			aClass131_23.method3799(local7);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
	public static synchronized void method4092() {
		@Pc(1) GL local1 = Static296.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub10 local8 = (Class1_Sub10) aClass131_18.method3798();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray539, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub10) aClass131_19.method3798();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub10) aClass131_20.method3798();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray539, 0);
								}
								while (true) {
									local8 = (Class1_Sub10) aClass131_21.method3798();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub18 local136 = (Class1_Sub18) aClass131_22.method3798();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub10) aClass131_23.method3798();
													if (local8 == null) {
														if (anInt5213 + anInt5214 + anInt5215 > 100663296 && Static294.method4792() > aLong169 + 60000L) {
															System.gc();
															aLong169 = Static294.method4792();
														}
														return;
													}
													local126 = (int) local8.aLong201;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass40Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt2809, local136.aClass40Array2[local126].anInt1389);
											}
											local1.glDeleteObjectARB(local136.anInt2809);
										}
									}
									local126 = (int) local8.aLong201;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray539[local3++] = (int) local8.aLong201;
							anInt5215 -= local8.anInt1508;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray539, 0);
								local3 = 0;
							}
						}
					}
					anIntArray539[local3++] = (int) local8.aLong201;
					anInt5214 -= local8.anInt1508;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray539, 0);
						local3 = 0;
					}
				}
			}
			anIntArray539[local3++] = (int) local8.aLong201;
			anInt5213 -= local8.anInt1508;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray539, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	public static synchronized void method4093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5216) {
			@Pc(8) Class1_Sub10 local8 = new Class1_Sub10(arg1);
			local8.aLong201 = arg0;
			aClass131_19.method3799(local8);
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
	public static synchronized void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5216) {
			@Pc(8) Class1_Sub10 local8 = new Class1_Sub10(arg1);
			local8.aLong201 = arg0;
			aClass131_18.method3799(local8);
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()V")
	public static synchronized void method4095() {
		anInt5216++;
		aClass131_18.method3795();
		aClass131_19.method3795();
		aClass131_20.method3795();
		aClass131_21.method3795();
		aClass131_22.method3795();
		aClass131_23.method3795();
		anInt5213 = 0;
		anInt5214 = 0;
		anInt5215 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	public static synchronized void method4096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt5216) {
			@Pc(7) Class1_Sub10 local7 = new Class1_Sub10();
			local7.aLong201 = arg0;
			aClass131_21.method3799(local7);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[Lclient!dl;I)V")
	public static synchronized void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) Class40[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt5216) {
			aClass131_22.method3799(new Class1_Sub18(arg0, arg1));
		}
	}
}
