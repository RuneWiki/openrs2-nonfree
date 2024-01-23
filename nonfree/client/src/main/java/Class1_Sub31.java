import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!qb;")
	private Class142 aClass142_27;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Lclient!an;")
	private Class12 aClass12_7;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
	private int[] anIntArray473;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "[I")
	private int[] anIntArray476;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "[F")
	private float[] aFloatArray30;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	private int anInt5412 = 0;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt5413 = 0;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public int anInt5415 = 0;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	private int anInt5414 = 0;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt5416 = 0;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt5417 = 0;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Z")
	private boolean aBoolean366;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public int anInt5410;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt5411 = arg0;
		this.aFloat168 = arg1;
		this.aBoolean365 = arg2;
		this.aBoolean366 = arg3;
		this.anInt5410 = arg4;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIFFFIF)I")
	public int method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub1 local28 = (Class1_Sub1) this.aClass142_27.method3543(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray472[local28.anInt12]) {
					this.anIntArray472[local28.anInt12] = arg1;
				}
				return local28.anInt12;
			}
		}
		this.anIntArray477[this.anInt5415] = arg0;
		this.anIntArray472[this.anInt5415] = arg1;
		this.anIntArray474[this.anInt5415] = arg2;
		if (this.aBoolean366) {
			this.aFloatArray30[this.anInt5415] = arg7;
		}
		this.aFloatArray27[this.anInt5415] = arg3;
		this.aFloatArray29[this.anInt5415] = arg4;
		this.aFloatArray28[this.anInt5415] = arg5;
		this.anIntArray478[this.anInt5415] = arg6;
		if (local1 != 0L) {
			this.aClass142_27.method3537(new Class1_Sub1(this.anInt5415), local1);
		}
		return this.anInt5415++;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public void method4602() {
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14((this.aBoolean366 ? 40 : 36) * this.anInt5415);
		for (@Pc(14) int local14 = 0; local14 < this.anInt5415; local14++) {
			if (Static156.aBoolean212) {
				local12.method1388((float) this.anIntArray477[local14]);
				local12.method1388((float) this.anIntArray472[local14]);
				local12.method1388((float) this.anIntArray474[local14]);
				local12.method1387(this.anIntArray478[local14]);
				local12.method1388(this.aFloatArray27[local14]);
				local12.method1388(this.aFloatArray29[local14]);
				local12.method1388(this.aFloatArray28[local14]);
				local12.method1388((float) this.anIntArray477[local14] / this.aFloat168);
				local12.method1388((float) this.anIntArray474[local14] / this.aFloat168);
				if (this.aBoolean366) {
					local12.method1388(this.aFloatArray30[local14]);
				}
			} else {
				local12.method1395((float) this.anIntArray477[local14]);
				local12.method1395((float) this.anIntArray472[local14]);
				local12.method1395((float) this.anIntArray474[local14]);
				local12.method1387(this.anIntArray478[local14]);
				local12.method1395(this.aFloatArray27[local14]);
				local12.method1395(this.aFloatArray29[local14]);
				local12.method1395(this.aFloatArray28[local14]);
				local12.method1395((float) this.anIntArray477[local14] / this.aFloat168);
				local12.method1395((float) this.anIntArray474[local14] / this.aFloat168);
				if (this.aBoolean366) {
					local12.method1395(this.aFloatArray30[local14]);
				}
			}
		}
		if (Static156.aBoolean206) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray17, 0, local12.anInt1480);
			this.aClass12_7 = new Class12();
			this.aClass12_7.method178(local200);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local12.anInt1480).order(ByteOrder.nativeOrder());
			this.aByteBuffer14.put(local12.aByteArray17, 0, local12.anInt1480);
			this.aByteBuffer14.flip();
		}
		this.anIntArray477 = null;
		this.anIntArray472 = null;
		this.anIntArray474 = null;
		this.anIntArray478 = null;
		this.aFloatArray27 = null;
		this.aFloatArray29 = null;
		this.aFloatArray28 = null;
		this.aClass142_27 = null;
		this.aFloatArray30 = null;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	public void method4604() {
		this.anIntArray477 = new int[this.anInt5417];
		this.anIntArray472 = new int[this.anInt5417];
		this.anIntArray474 = new int[this.anInt5417];
		if (this.aBoolean366) {
			this.aFloatArray30 = new float[this.anInt5417];
		}
		this.anIntArray478 = new int[this.anInt5417];
		this.aFloatArray27 = new float[this.anInt5417];
		this.aFloatArray29 = new float[this.anInt5417];
		this.aFloatArray28 = new float[this.anInt5417];
		this.anIntArray473 = new int[this.anInt5413];
		this.anIntArray476 = new int[this.anInt5413];
		this.anIntArray475 = new int[this.anInt5413];
		this.anIntArrayArray46 = new int[this.anInt5413][];
		this.aClass142_27 = new Class142(Static218.method1098(this.anInt5417));
		if (this.aBoolean365) {
			this.anIntArrayArray45 = new int[this.anInt5413][];
			this.aBooleanArray24 = new boolean[this.anInt5413];
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([[[Lclient!wk;FZ)V")
	public void method4606(@OriginalArg(0) Class1_Sub33[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static305.aClass1_Sub14_10 == null || Static305.aClass1_Sub14_10.aByteArray17.length < this.anInt5416 * 4) {
			Static305.aClass1_Sub14_10 = new Class1_Sub14(this.anInt5416 * 4);
		} else {
			Static305.aClass1_Sub14_10.anInt1480 = 0;
		}
		if (Static305.aClass1_Sub14_9 == null || Static305.aClass1_Sub14_9.aByteArray17.length < this.anInt5414 * 4) {
			Static305.aClass1_Sub14_9 = new Class1_Sub14(this.anInt5414 * 4);
		} else {
			Static305.aClass1_Sub14_9.anInt1480 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub33 local68;
		@Pc(111) Class1_Sub14 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static156.aBoolean212) {
			for (local47 = 0; local47 < this.anInt5412; local47++) {
				local68 = arg0[this.anIntArray475[local47]][this.anIntArray473[local47]][this.anIntArray476[local47]];
				if (local68 != null && local68.aBoolean390) {
					local78 = this.anIntArrayArray46[local47];
					if (this.aBoolean365) {
						local86 = this.anIntArrayArray45[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static305.aClass1_Sub14_9.method1387(local86[local90]);
							}
						}
						local111 = this.aBooleanArray24[local47] ? Static305.aClass1_Sub14_9 : Static305.aClass1_Sub14_10;
					} else {
						local111 = Static305.aClass1_Sub14_10;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method1387(local78[0]);
						local111.method1387(local78[local116]);
						local111.method1387(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt5412; local47++) {
				local68 = arg0[this.anIntArray475[local47]][this.anIntArray473[local47]][this.anIntArray476[local47]];
				if (local68 != null && local68.aBoolean390) {
					local78 = this.anIntArrayArray46[local47];
					if (this.aBoolean365) {
						local86 = this.anIntArrayArray45[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static305.aClass1_Sub14_9.method1347(local86[local90]);
							}
						}
						local111 = this.aBooleanArray24[local47] ? Static305.aClass1_Sub14_9 : Static305.aClass1_Sub14_10;
					} else {
						local111 = Static305.aClass1_Sub14_10;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method1347(local78[0]);
						local111.method1347(local78[local116]);
						local111.method1347(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static305.aClass1_Sub14_10.anInt1480 == 0 && Static305.aClass1_Sub14_9.anInt1480 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static156.aGL1;
		if (this.anInt5411 == -1 || arg2) {
			Static156.method2699(-1);
			Static90.method1648(0, 0);
		} else {
			Static215.anInterface5_1.method782(this.anInt5411);
		}
		@Pc(282) int local282 = this.aBoolean366 ? 40 : 36;
		if (this.aClass12_7 == null) {
			if (Static156.aBoolean206) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer14.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer14);
			this.aByteBuffer14.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer14);
			if (Static311.aBoolean384) {
				this.aByteBuffer14.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer14);
			}
			this.aByteBuffer14.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer14);
			if (this.aBoolean366) {
				local257.glClientActiveTexture(Static230.method3556());
				this.aByteBuffer14.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer14);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass12_7.method179();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static311.aBoolean384) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean366) {
				local257.glClientActiveTexture(Static230.method3556());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static156.aBoolean206) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static305.aClass1_Sub14_10.anInt1480 != 0) {
			if (Static305.aByteBuffer15 == null || Static305.aByteBuffer15.capacity() < Static305.aClass1_Sub14_10.anInt1480) {
				Static305.aByteBuffer15 = ByteBuffer.allocateDirect(Static305.aClass1_Sub14_10.anInt1480).order(ByteOrder.nativeOrder());
			} else {
				Static305.aByteBuffer15.clear();
			}
			Static305.aByteBuffer15.put(Static305.aClass1_Sub14_10.aByteArray17, 0, Static305.aClass1_Sub14_10.anInt1480);
			Static305.aByteBuffer15.flip();
			Static156.method2658(arg1);
			local257.glDrawElements(4, Static305.aClass1_Sub14_10.anInt1480 / 4, 5125, Static305.aByteBuffer15);
		}
		if (Static305.aClass1_Sub14_9.anInt1480 == 0) {
			return;
		}
		if (Static305.aByteBuffer13 == null || Static305.aByteBuffer13.capacity() < Static305.aClass1_Sub14_9.anInt1480) {
			Static305.aByteBuffer13 = ByteBuffer.allocateDirect(Static305.aClass1_Sub14_9.anInt1480).order(ByteOrder.nativeOrder());
		} else {
			Static305.aByteBuffer13.clear();
		}
		Static305.aByteBuffer13.put(Static305.aClass1_Sub14_9.aByteArray17, 0, Static305.aClass1_Sub14_9.anInt1480);
		Static305.aByteBuffer13.flip();
		Static156.method2658(arg1 - 100.0F);
		Static156.method2656();
		local257.glDrawElements(4, Static305.aClass1_Sub14_9.anInt1480 / 4, 5125, Static305.aByteBuffer13);
		Static156.method2676();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[I[IZ)I")
	public int method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean365) {
			this.anIntArrayArray45[this.anInt5412] = arg4;
			this.aBooleanArray24[this.anInt5412] = arg5;
			if (arg4 != null) {
				this.anInt5414 += arg4.length;
			}
			if (arg5) {
				this.anInt5414 += (arg3.length - 2) * 3;
			} else {
				this.anInt5416 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt5416 += (arg3.length - 2) * 3;
		}
		this.anIntArray475[this.anInt5412] = arg0;
		this.anIntArray473[this.anInt5412] = arg1;
		this.anIntArray476[this.anInt5412] = arg2;
		this.anIntArrayArray46[this.anInt5412] = arg3;
		return this.anInt5412++;
	}
}
