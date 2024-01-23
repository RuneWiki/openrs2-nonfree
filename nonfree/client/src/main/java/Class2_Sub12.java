import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "[F")
	private float[] aFloatArray8;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "[F")
	private float[] aFloatArray9;

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "[Z")
	private boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "Lclient!ii;")
	private Class79 aClass79_10;

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!fn", name = "J", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!fn", name = "N", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!fn", name = "Q", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!fn", name = "T", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!fn", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!fn", name = "V", descriptor = "Lclient!de;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!fn", name = "W", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!fn", name = "X", descriptor = "[F")
	private float[] aFloatArray11;

	@OriginalMember(owner = "client!fn", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
	public int anInt1663 = 0;

	@OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
	private int anInt1666 = 0;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
	public int anInt1664 = 0;

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "I")
	private int anInt1668 = 0;

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
	private int anInt1665 = 0;

	@OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
	public int anInt1669 = 0;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
	public int anInt1662;

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!fn", name = "M", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
	public int anInt1667;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IFZZI)V")
	public Class2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt1662 = arg0;
		this.aFloat18 = arg1;
		this.aBoolean136 = arg2;
		this.aBoolean135 = arg3;
		this.anInt1667 = arg4;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "()V")
	public void method1396() {
		this.anIntArray122 = new int[this.anInt1669];
		this.anIntArray117 = new int[this.anInt1669];
		this.anIntArray120 = new int[this.anInt1669];
		if (this.aBoolean135) {
			this.aFloatArray9 = new float[this.anInt1669];
		}
		this.anIntArray123 = new int[this.anInt1669];
		this.aFloatArray11 = new float[this.anInt1669];
		this.aFloatArray8 = new float[this.anInt1669];
		this.aFloatArray10 = new float[this.anInt1669];
		this.anIntArray119 = new int[this.anInt1664];
		this.anIntArray118 = new int[this.anInt1664];
		this.anIntArray121 = new int[this.anInt1664];
		this.anIntArrayArray17 = new int[this.anInt1664][];
		this.aClass79_10 = new Class79(Static7.method217(this.anInt1669));
		if (this.aBoolean136) {
			this.anIntArrayArray16 = new int[this.anInt1664][];
			this.aBooleanArray7 = new boolean[this.anInt1664];
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "()V")
	public void method1397() {
		@Pc(12) Class2_Sub26 local12 = new Class2_Sub26((this.aBoolean135 ? 40 : 36) * this.anInt1663);
		for (@Pc(14) int local14 = 0; local14 < this.anInt1663; local14++) {
			if (Static60.aBoolean114) {
				local12.method4266((float) this.anIntArray122[local14]);
				local12.method4266((float) this.anIntArray117[local14]);
				local12.method4266((float) this.anIntArray120[local14]);
				local12.method4260(this.anIntArray123[local14]);
				local12.method4266(this.aFloatArray11[local14]);
				local12.method4266(this.aFloatArray8[local14]);
				local12.method4266(this.aFloatArray10[local14]);
				local12.method4266((float) this.anIntArray122[local14] / this.aFloat18);
				local12.method4266((float) this.anIntArray120[local14] / this.aFloat18);
				if (this.aBoolean135) {
					local12.method4266(this.aFloatArray9[local14]);
				}
			} else {
				local12.method4244((float) this.anIntArray122[local14]);
				local12.method4244((float) this.anIntArray117[local14]);
				local12.method4244((float) this.anIntArray120[local14]);
				local12.method4260(this.anIntArray123[local14]);
				local12.method4244(this.aFloatArray11[local14]);
				local12.method4244(this.aFloatArray8[local14]);
				local12.method4244(this.aFloatArray10[local14]);
				local12.method4244((float) this.anIntArray122[local14] / this.aFloat18);
				local12.method4244((float) this.anIntArray120[local14] / this.aFloat18);
				if (this.aBoolean135) {
					local12.method4244(this.aFloatArray9[local14]);
				}
			}
		}
		if (Static60.aBoolean110) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray72, 0, local12.anInt5328);
			this.aClass38_2 = new Class38();
			this.aClass38_2.method837(local200);
		} else {
			this.aByteBuffer5 = ByteBuffer.allocateDirect(local12.anInt5328).order(ByteOrder.nativeOrder());
			this.aByteBuffer5.put(local12.aByteArray72, 0, local12.anInt5328);
			this.aByteBuffer5.flip();
		}
		this.anIntArray122 = null;
		this.anIntArray117 = null;
		this.anIntArray120 = null;
		this.anIntArray123 = null;
		this.aFloatArray11 = null;
		this.aFloatArray8 = null;
		this.aFloatArray10 = null;
		this.aClass79_10 = null;
		this.aFloatArray9 = null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([[[Lclient!vb;FZ)V")
	public void method1399(@OriginalArg(0) Class2_Sub31[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static78.aClass2_Sub26_3 == null || Static78.aClass2_Sub26_3.aByteArray72.length < this.anInt1665 * 4) {
			Static78.aClass2_Sub26_3 = new Class2_Sub26(this.anInt1665 * 4);
		} else {
			Static78.aClass2_Sub26_3.anInt5328 = 0;
		}
		if (Static78.aClass2_Sub26_2 == null || Static78.aClass2_Sub26_2.aByteArray72.length < this.anInt1668 * 4) {
			Static78.aClass2_Sub26_2 = new Class2_Sub26(this.anInt1668 * 4);
		} else {
			Static78.aClass2_Sub26_2.anInt5328 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class2_Sub31 local68;
		@Pc(111) Class2_Sub26 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static60.aBoolean114) {
			for (local47 = 0; local47 < this.anInt1666; local47++) {
				local68 = arg0[this.anIntArray121[local47]][this.anIntArray119[local47]][this.anIntArray118[local47]];
				if (local68 != null && local68.aBoolean456) {
					local78 = this.anIntArrayArray17[local47];
					if (this.aBoolean136) {
						local86 = this.anIntArrayArray16[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static78.aClass2_Sub26_2.method4260(local86[local90]);
							}
						}
						local111 = this.aBooleanArray7[local47] ? Static78.aClass2_Sub26_2 : Static78.aClass2_Sub26_3;
					} else {
						local111 = Static78.aClass2_Sub26_3;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method4260(local78[0]);
						local111.method4260(local78[local116]);
						local111.method4260(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt1666; local47++) {
				local68 = arg0[this.anIntArray121[local47]][this.anIntArray119[local47]][this.anIntArray118[local47]];
				if (local68 != null && local68.aBoolean456) {
					local78 = this.anIntArrayArray17[local47];
					if (this.aBoolean136) {
						local86 = this.anIntArrayArray16[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static78.aClass2_Sub26_2.method4259(local86[local90]);
							}
						}
						local111 = this.aBooleanArray7[local47] ? Static78.aClass2_Sub26_2 : Static78.aClass2_Sub26_3;
					} else {
						local111 = Static78.aClass2_Sub26_3;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method4259(local78[0]);
						local111.method4259(local78[local116]);
						local111.method4259(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static78.aClass2_Sub26_3.anInt5328 == 0 && Static78.aClass2_Sub26_2.anInt5328 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static60.aGL1;
		if (this.anInt1662 == -1 || arg2) {
			Static60.method1157(-1);
			Static4.method119(0, 0);
		} else {
			Static93.anInterface5_1.method3512(this.anInt1662);
		}
		@Pc(282) int local282 = this.aBoolean135 ? 40 : 36;
		if (this.aClass38_2 == null) {
			if (Static60.aBoolean110) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer5.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer5);
			this.aByteBuffer5.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer5);
			if (Static56.aBoolean96) {
				this.aByteBuffer5.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer5);
			}
			this.aByteBuffer5.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer5);
			if (this.aBoolean135) {
				local257.glClientActiveTexture(Static24.method479());
				this.aByteBuffer5.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer5);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass38_2.method838();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static56.aBoolean96) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean135) {
				local257.glClientActiveTexture(Static24.method479());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static60.aBoolean110) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static78.aClass2_Sub26_3.anInt5328 != 0) {
			if (Static78.aByteBuffer3 == null || Static78.aByteBuffer3.capacity() < Static78.aClass2_Sub26_3.anInt5328) {
				Static78.aByteBuffer3 = ByteBuffer.allocateDirect(Static78.aClass2_Sub26_3.anInt5328).order(ByteOrder.nativeOrder());
			} else {
				Static78.aByteBuffer3.clear();
			}
			Static78.aByteBuffer3.put(Static78.aClass2_Sub26_3.aByteArray72, 0, Static78.aClass2_Sub26_3.anInt5328);
			Static78.aByteBuffer3.flip();
			Static60.method1142(arg1);
			local257.glDrawElements(4, Static78.aClass2_Sub26_3.anInt5328 / 4, 5125, Static78.aByteBuffer3);
		}
		if (Static78.aClass2_Sub26_2.anInt5328 == 0) {
			return;
		}
		if (Static78.aByteBuffer4 == null || Static78.aByteBuffer4.capacity() < Static78.aClass2_Sub26_2.anInt5328) {
			Static78.aByteBuffer4 = ByteBuffer.allocateDirect(Static78.aClass2_Sub26_2.anInt5328).order(ByteOrder.nativeOrder());
		} else {
			Static78.aByteBuffer4.clear();
		}
		Static78.aByteBuffer4.put(Static78.aClass2_Sub26_2.aByteArray72, 0, Static78.aClass2_Sub26_2.anInt5328);
		Static78.aByteBuffer4.flip();
		Static60.method1142(arg1 - 100.0F);
		Static60.method1158();
		local257.glDrawElements(4, Static78.aClass2_Sub26_2.anInt5328 / 4, 5125, Static78.aByteBuffer4);
		Static60.method1145();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[I[IZ)I")
	public int method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean136) {
			this.anIntArrayArray16[this.anInt1666] = arg4;
			this.aBooleanArray7[this.anInt1666] = arg5;
			if (arg4 != null) {
				this.anInt1668 += arg4.length;
			}
			if (arg5) {
				this.anInt1668 += (arg3.length - 2) * 3;
			} else {
				this.anInt1665 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt1665 += (arg3.length - 2) * 3;
		}
		this.anIntArray121[this.anInt1666] = arg0;
		this.anIntArray119[this.anInt1666] = arg1;
		this.anIntArray118[this.anInt1666] = arg2;
		this.anIntArrayArray17[this.anInt1666] = arg3;
		return this.anInt1666++;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIFFFIF)I")
	public int method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class2_Sub21 local28 = (Class2_Sub21) this.aClass79_10.method2002(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray117[local28.anInt4234]) {
					this.anIntArray117[local28.anInt4234] = arg1;
				}
				return local28.anInt4234;
			}
		}
		this.anIntArray122[this.anInt1663] = arg0;
		this.anIntArray117[this.anInt1663] = arg1;
		this.anIntArray120[this.anInt1663] = arg2;
		if (this.aBoolean135) {
			this.aFloatArray9[this.anInt1663] = arg7;
		}
		this.aFloatArray11[this.anInt1663] = arg3;
		this.aFloatArray8[this.anInt1663] = arg4;
		this.aFloatArray10[this.anInt1663] = arg5;
		this.anIntArray123[this.anInt1663] = arg6;
		if (local1 != 0L) {
			this.aClass79_10.method1994(local1, new Class2_Sub21(this.anInt1663));
		}
		return this.anInt1663++;
	}
}
