import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "J")
	private static long aLong12 = 0L;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public static int anInt141 = 0;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt142 = 0;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!gj;")
	private static Class59 aClass59_2 = new Class59();

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	public static int anInt143 = 0;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public static int anInt144 = 0;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!gj;")
	private static Class59 aClass59_3 = new Class59();

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!gj;")
	private static Class59 aClass59_4 = new Class59();

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!gj;")
	private static Class59 aClass59_5 = new Class59();

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Lclient!gj;")
	private static Class59 aClass59_6 = new Class59();

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!gj;")
	private static Class59 aClass59_7 = new Class59();

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
	private static int[] anIntArray10 = new int[1000];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	public static synchronized void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt142) {
			@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(arg1);
			local8.aLong214 = arg0;
			aClass59_2.method1706(local8);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
	public static synchronized void method128() {
		anInt142++;
		aClass59_2.method1703();
		aClass59_3.method1703();
		aClass59_4.method1703();
		aClass59_5.method1703();
		aClass59_6.method1703();
		aClass59_7.method1703();
		anInt144 = 0;
		anInt143 = 0;
		anInt141 = 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[Lclient!ha;I)V")
	public static synchronized void method129(@OriginalArg(0) int arg0, @OriginalArg(1) Class62[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt142) {
			aClass59_6.method1706(new Class1_Sub21(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V")
	public static synchronized void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt142) {
			@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(arg1);
			local8.aLong214 = arg0;
			aClass59_4.method1706(local8);
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)V")
	public static synchronized void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt142) {
			@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(arg1);
			local8.aLong214 = arg0;
			aClass59_3.method1706(local8);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public static synchronized void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt142) {
			@Pc(7) Class1_Sub1 local7 = new Class1_Sub1();
			local7.aLong214 = arg0;
			aClass59_5.method1706(local7);
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
	public static synchronized void method134() {
		@Pc(1) GL local1 = Static156.aGL1;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) Class1_Sub1 local8 = (Class1_Sub1) aClass59_2.method1700();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffersARB(local3, anIntArray10, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (Class1_Sub1) aClass59_3.method1700();
					if (local8 == null) {
						while (true) {
							local8 = (Class1_Sub1) aClass59_4.method1700();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray10, 0);
								}
								while (true) {
									local8 = (Class1_Sub1) aClass59_5.method1700();
									@Pc(126) int local126;
									if (local8 == null) {
										while (true) {
											@Pc(136) Class1_Sub21 local136 = (Class1_Sub21) aClass59_6.method1700();
											if (local136 == null) {
												while (true) {
													local8 = (Class1_Sub1) aClass59_7.method1700();
													if (local8 == null) {
														if (anInt144 + anInt143 + anInt141 > 100663296 && Static298.method4535() > aLong12 + 60000L) {
															System.gc();
															aLong12 = Static298.method4535();
														}
														return;
													}
													local126 = (int) local8.aLong214;
													local1.glDeleteObjectARB(local126);
												}
											}
											for (local126 = 0; local126 < local136.aClass62Array2.length; local126++) {
												local1.glDetachObjectARB(local136.anInt3290, local136.aClass62Array2[local126].anInt2009);
											}
											local1.glDeleteObjectARB(local136.anInt3290);
										}
									}
									local126 = (int) local8.aLong214;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray10[local3++] = (int) local8.aLong214;
							anInt141 -= local8.anInt12;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray10, 0);
								local3 = 0;
							}
						}
					}
					anIntArray10[local3++] = (int) local8.aLong214;
					anInt143 -= local8.anInt12;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray10, 0);
						local3 = 0;
					}
				}
			}
			anIntArray10[local3++] = (int) local8.aLong214;
			anInt144 -= local8.anInt12;
			if (local3 == 1000) {
				local1.glDeleteBuffersARB(local3, anIntArray10, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public static synchronized void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt142) {
			@Pc(7) Class1_Sub1 local7 = new Class1_Sub1();
			local7.aLong214 = arg0;
			aClass59_7.method1706(local7);
		}
	}
}
