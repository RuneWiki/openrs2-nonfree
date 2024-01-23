import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!il;")
	private Class86 aClass86_14;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "[F")
	private float[] aFloatArray17;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[F")
	private float[] aFloatArray18;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Lclient!vj;")
	private Class181 aClass181_6;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public int anInt2501 = 0;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	private int anInt2502 = 0;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public int anInt2504 = 0;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt2506 = 0;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	private int anInt2507 = 0;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
	private int anInt2508 = 0;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	public int anInt2503;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt2503 = arg0;
		this.aFloat59 = arg1;
		this.aBoolean219 = arg2;
		this.aBoolean218 = arg3;
		this.anInt2505 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[I[IZ)I")
	public int method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean219) {
			this.anIntArrayArray14[this.anInt2507] = arg4;
			this.aBooleanArray7[this.anInt2507] = arg5;
			if (arg4 != null) {
				this.anInt2502 += arg4.length;
			}
			if (arg5) {
				this.anInt2502 += (arg3.length - 2) * 3;
			} else {
				this.anInt2508 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt2508 += (arg3.length - 2) * 3;
		}
		this.anIntArray186[this.anInt2507] = arg0;
		this.anIntArray185[this.anInt2507] = arg1;
		this.anIntArray187[this.anInt2507] = arg2;
		this.anIntArrayArray15[this.anInt2507] = arg3;
		return this.anInt2507++;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	public void method2223() {
		this.anIntArray184 = new int[this.anInt2504];
		this.anIntArray183 = new int[this.anInt2504];
		this.anIntArray188 = new int[this.anInt2504];
		if (this.aBoolean218) {
			this.aFloatArray18 = new float[this.anInt2504];
		}
		this.anIntArray182 = new int[this.anInt2504];
		this.aFloatArray17 = new float[this.anInt2504];
		this.aFloatArray19 = new float[this.anInt2504];
		this.aFloatArray20 = new float[this.anInt2504];
		this.anIntArray185 = new int[this.anInt2506];
		this.anIntArray187 = new int[this.anInt2506];
		this.anIntArray186 = new int[this.anInt2506];
		this.anIntArrayArray15 = new int[this.anInt2506][];
		this.aClass86_14 = new Class86(Static138.method3842(this.anInt2504));
		if (this.aBoolean219) {
			this.anIntArrayArray14 = new int[this.anInt2506][];
			this.aBooleanArray7 = new boolean[this.anInt2506];
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
	public void method2224() {
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13((this.aBoolean218 ? 40 : 36) * this.anInt2501);
		for (@Pc(14) int local14 = 0; local14 < this.anInt2501; local14++) {
			if (Static71.aBoolean168) {
				local12.method1881((float) this.anIntArray184[local14]);
				local12.method1881((float) this.anIntArray183[local14]);
				local12.method1881((float) this.anIntArray188[local14]);
				local12.method1851(this.anIntArray182[local14]);
				local12.method1881(this.aFloatArray17[local14]);
				local12.method1881(this.aFloatArray19[local14]);
				local12.method1881(this.aFloatArray20[local14]);
				local12.method1881((float) this.anIntArray184[local14] / this.aFloat59);
				local12.method1881((float) this.anIntArray188[local14] / this.aFloat59);
				if (this.aBoolean218) {
					local12.method1881(this.aFloatArray18[local14]);
				}
			} else {
				local12.method1848((float) this.anIntArray184[local14]);
				local12.method1848((float) this.anIntArray183[local14]);
				local12.method1848((float) this.anIntArray188[local14]);
				local12.method1851(this.anIntArray182[local14]);
				local12.method1848(this.aFloatArray17[local14]);
				local12.method1848(this.aFloatArray19[local14]);
				local12.method1848(this.aFloatArray20[local14]);
				local12.method1848((float) this.anIntArray184[local14] / this.aFloat59);
				local12.method1848((float) this.anIntArray188[local14] / this.aFloat59);
				if (this.aBoolean218) {
					local12.method1848(this.aFloatArray18[local14]);
				}
			}
		}
		if (Static71.aBoolean159) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray63, 0, local12.anInt2018);
			this.aClass181_6 = new Class181();
			this.aClass181_6.method4480(local200);
		} else {
			this.aByteBuffer8 = ByteBuffer.allocateDirect(local12.anInt2018).order(ByteOrder.nativeOrder());
			this.aByteBuffer8.put(local12.aByteArray63, 0, local12.anInt2018);
			this.aByteBuffer8.flip();
		}
		this.anIntArray184 = null;
		this.anIntArray183 = null;
		this.anIntArray188 = null;
		this.anIntArray182 = null;
		this.aFloatArray17 = null;
		this.aFloatArray19 = null;
		this.aFloatArray20 = null;
		this.aClass86_14 = null;
		this.aFloatArray18 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIFFFIF)I")
	public int method2227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub22 local28 = (Class1_Sub22) this.aClass86_14.method2136(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray183[local28.anInt3973]) {
					this.anIntArray183[local28.anInt3973] = arg1;
				}
				return local28.anInt3973;
			}
		}
		this.anIntArray184[this.anInt2501] = arg0;
		this.anIntArray183[this.anInt2501] = arg1;
		this.anIntArray188[this.anInt2501] = arg2;
		if (this.aBoolean218) {
			this.aFloatArray18[this.anInt2501] = arg7;
		}
		this.aFloatArray17[this.anInt2501] = arg3;
		this.aFloatArray19[this.anInt2501] = arg4;
		this.aFloatArray20[this.anInt2501] = arg5;
		this.anIntArray182[this.anInt2501] = arg6;
		if (local1 != 0L) {
			this.aClass86_14.method2144(new Class1_Sub22(this.anInt2501), local1);
		}
		return this.anInt2501++;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([[[Lclient!jj;FZ)V")
	public void method2228(@OriginalArg(0) Class1_Sub16[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static123.aClass1_Sub13_4 == null || Static123.aClass1_Sub13_4.aByteArray63.length < this.anInt2508 * 4) {
			Static123.aClass1_Sub13_4 = new Class1_Sub13(this.anInt2508 * 4);
		} else {
			Static123.aClass1_Sub13_4.anInt2018 = 0;
		}
		if (Static123.aClass1_Sub13_5 == null || Static123.aClass1_Sub13_5.aByteArray63.length < this.anInt2502 * 4) {
			Static123.aClass1_Sub13_5 = new Class1_Sub13(this.anInt2502 * 4);
		} else {
			Static123.aClass1_Sub13_5.anInt2018 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub16 local68;
		@Pc(111) Class1_Sub13 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static71.aBoolean168) {
			for (local47 = 0; local47 < this.anInt2507; local47++) {
				local68 = arg0[this.anIntArray186[local47]][this.anIntArray185[local47]][this.anIntArray187[local47]];
				if (local68 != null && local68.aBoolean228) {
					local78 = this.anIntArrayArray15[local47];
					if (this.aBoolean219) {
						local86 = this.anIntArrayArray14[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static123.aClass1_Sub13_5.method1851(local86[local90]);
							}
						}
						local111 = this.aBooleanArray7[local47] ? Static123.aClass1_Sub13_5 : Static123.aClass1_Sub13_4;
					} else {
						local111 = Static123.aClass1_Sub13_4;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method1851(local78[0]);
						local111.method1851(local78[local116]);
						local111.method1851(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt2507; local47++) {
				local68 = arg0[this.anIntArray186[local47]][this.anIntArray185[local47]][this.anIntArray187[local47]];
				if (local68 != null && local68.aBoolean228) {
					local78 = this.anIntArrayArray15[local47];
					if (this.aBoolean219) {
						local86 = this.anIntArrayArray14[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static123.aClass1_Sub13_5.method1839(local86[local90]);
							}
						}
						local111 = this.aBooleanArray7[local47] ? Static123.aClass1_Sub13_5 : Static123.aClass1_Sub13_4;
					} else {
						local111 = Static123.aClass1_Sub13_4;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method1839(local78[0]);
						local111.method1839(local78[local116]);
						local111.method1839(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static123.aClass1_Sub13_4.anInt2018 == 0 && Static123.aClass1_Sub13_5.anInt2018 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static71.aGL1;
		if (this.anInt2503 == -1 || arg2) {
			Static71.method1400(-1);
			Static165.method4612(0, 0);
		} else {
			Static119.anInterface5_1.method1480(this.anInt2503);
		}
		@Pc(282) int local282 = this.aBoolean218 ? 40 : 36;
		if (this.aClass181_6 == null) {
			if (Static71.aBoolean159) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer8.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer8);
			this.aByteBuffer8.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer8);
			if (Static69.aBoolean146) {
				this.aByteBuffer8.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer8);
			}
			this.aByteBuffer8.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer8);
			if (this.aBoolean218) {
				local257.glClientActiveTexture(Static113.method2036());
				this.aByteBuffer8.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer8);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass181_6.method4481();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static69.aBoolean146) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean218) {
				local257.glClientActiveTexture(Static113.method2036());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static71.aBoolean159) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static123.aClass1_Sub13_4.anInt2018 != 0) {
			if (Static123.aByteBuffer7 == null || Static123.aByteBuffer7.capacity() < Static123.aClass1_Sub13_4.anInt2018) {
				Static123.aByteBuffer7 = ByteBuffer.allocateDirect(Static123.aClass1_Sub13_4.anInt2018).order(ByteOrder.nativeOrder());
			} else {
				Static123.aByteBuffer7.clear();
			}
			Static123.aByteBuffer7.put(Static123.aClass1_Sub13_4.aByteArray63, 0, Static123.aClass1_Sub13_4.anInt2018);
			Static123.aByteBuffer7.flip();
			Static71.method1385(arg1);
			local257.glDrawElements(4, Static123.aClass1_Sub13_4.anInt2018 / 4, 5125, Static123.aByteBuffer7);
		}
		if (Static123.aClass1_Sub13_5.anInt2018 == 0) {
			return;
		}
		if (Static123.aByteBuffer9 == null || Static123.aByteBuffer9.capacity() < Static123.aClass1_Sub13_5.anInt2018) {
			Static123.aByteBuffer9 = ByteBuffer.allocateDirect(Static123.aClass1_Sub13_5.anInt2018).order(ByteOrder.nativeOrder());
		} else {
			Static123.aByteBuffer9.clear();
		}
		Static123.aByteBuffer9.put(Static123.aClass1_Sub13_5.aByteArray63, 0, Static123.aClass1_Sub13_5.anInt2018);
		Static123.aByteBuffer9.flip();
		Static71.method1385(arg1 - 100.0F);
		Static71.method1384();
		local257.glDrawElements(4, Static123.aClass1_Sub13_5.anInt2018 / 4, 5125, Static123.aByteBuffer9);
		Static71.method1395();
	}
}
