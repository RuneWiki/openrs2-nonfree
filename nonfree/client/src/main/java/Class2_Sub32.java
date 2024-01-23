import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!kf;")
	private Class95 aClass95_7;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "[I")
	private int[] anIntArray597;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "[F")
	private float[] aFloatArray30;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "[Z")
	private boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "[I")
	private int[] anIntArray598;

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!wl", name = "F", descriptor = "[I")
	private int[] anIntArray599;

	@OriginalMember(owner = "client!wl", name = "J", descriptor = "Lclient!l;")
	private Class101 aClass101_28;

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "[I")
	private int[] anIntArray600;

	@OriginalMember(owner = "client!wl", name = "N", descriptor = "[I")
	private int[] anIntArray601;

	@OriginalMember(owner = "client!wl", name = "P", descriptor = "[I")
	private int[] anIntArray602;

	@OriginalMember(owner = "client!wl", name = "Q", descriptor = "[I")
	private int[] anIntArray603;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	private int anInt6049 = 0;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
	public int anInt6047 = 0;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public int anInt6046 = 0;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	private int anInt6050 = 0;

	@OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
	private int anInt6052 = 0;

	@OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
	public int anInt6053 = 0;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
	public int anInt6048;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
	public int anInt6051;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IFZZI)V")
	public Class2_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt6048 = arg0;
		this.aFloat59 = arg1;
		this.aBoolean401 = arg2;
		this.aBoolean402 = arg3;
		this.anInt6051 = arg4;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()V")
	public void method4747() {
		this.anIntArray599 = new int[this.anInt6053];
		this.anIntArray598 = new int[this.anInt6053];
		this.anIntArray602 = new int[this.anInt6053];
		if (this.aBoolean402) {
			this.aFloatArray28 = new float[this.anInt6053];
		}
		this.anIntArray601 = new int[this.anInt6053];
		this.aFloatArray30 = new float[this.anInt6053];
		this.aFloatArray29 = new float[this.anInt6053];
		this.aFloatArray27 = new float[this.anInt6053];
		this.anIntArray600 = new int[this.anInt6046];
		this.anIntArray603 = new int[this.anInt6046];
		this.anIntArray597 = new int[this.anInt6046];
		this.anIntArrayArray47 = new int[this.anInt6046][];
		this.aClass101_28 = new Class101(Static305.method4628(this.anInt6053));
		if (this.aBoolean401) {
			this.anIntArrayArray48 = new int[this.anInt6046][];
			this.aBooleanArray24 = new boolean[this.anInt6046];
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
	public void method4748() {
		@Pc(12) Class2_Sub16 local12 = new Class2_Sub16((this.aBoolean402 ? 40 : 36) * this.anInt6047);
		for (@Pc(14) int local14 = 0; local14 < this.anInt6047; local14++) {
			if (Static116.aBoolean180) {
				local12.method2147((float) this.anIntArray599[local14]);
				local12.method2147((float) this.anIntArray598[local14]);
				local12.method2147((float) this.anIntArray602[local14]);
				local12.method2186(this.anIntArray601[local14]);
				local12.method2147(this.aFloatArray30[local14]);
				local12.method2147(this.aFloatArray29[local14]);
				local12.method2147(this.aFloatArray27[local14]);
				local12.method2147((float) this.anIntArray599[local14] / this.aFloat59);
				local12.method2147((float) this.anIntArray602[local14] / this.aFloat59);
				if (this.aBoolean402) {
					local12.method2147(this.aFloatArray28[local14]);
				}
			} else {
				local12.method2142((float) this.anIntArray599[local14]);
				local12.method2142((float) this.anIntArray598[local14]);
				local12.method2142((float) this.anIntArray602[local14]);
				local12.method2186(this.anIntArray601[local14]);
				local12.method2142(this.aFloatArray30[local14]);
				local12.method2142(this.aFloatArray29[local14]);
				local12.method2142(this.aFloatArray27[local14]);
				local12.method2142((float) this.anIntArray599[local14] / this.aFloat59);
				local12.method2142((float) this.anIntArray602[local14] / this.aFloat59);
				if (this.aBoolean402) {
					local12.method2142(this.aFloatArray28[local14]);
				}
			}
		}
		if (Static116.aBoolean186) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray17, 0, local12.anInt2789);
			this.aClass95_7 = new Class95();
			this.aClass95_7.method2650(local200);
		} else {
			this.aByteBuffer14 = ByteBuffer.allocateDirect(local12.anInt2789).order(ByteOrder.nativeOrder());
			this.aByteBuffer14.put(local12.aByteArray17, 0, local12.anInt2789);
			this.aByteBuffer14.flip();
		}
		this.anIntArray599 = null;
		this.anIntArray598 = null;
		this.anIntArray602 = null;
		this.anIntArray601 = null;
		this.aFloatArray30 = null;
		this.aFloatArray29 = null;
		this.aFloatArray27 = null;
		this.aClass101_28 = null;
		this.aFloatArray28 = null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III[I[IZ)I")
	public int method4749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean401) {
			this.anIntArrayArray48[this.anInt6050] = arg4;
			this.aBooleanArray24[this.anInt6050] = arg5;
			if (arg4 != null) {
				this.anInt6052 += arg4.length;
			}
			if (arg5) {
				this.anInt6052 += (arg3.length - 2) * 3;
			} else {
				this.anInt6049 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt6049 += (arg3.length - 2) * 3;
		}
		this.anIntArray597[this.anInt6050] = arg0;
		this.anIntArray600[this.anInt6050] = arg1;
		this.anIntArray603[this.anInt6050] = arg2;
		this.anIntArrayArray47[this.anInt6050] = arg3;
		return this.anInt6050++;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([[[Lclient!ee;FZ)V")
	public void method4751(@OriginalArg(0) Class2_Sub13[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static314.aClass2_Sub16_10 == null || Static314.aClass2_Sub16_10.aByteArray17.length < this.anInt6049 * 4) {
			Static314.aClass2_Sub16_10 = new Class2_Sub16(this.anInt6049 * 4);
		} else {
			Static314.aClass2_Sub16_10.anInt2789 = 0;
		}
		if (Static314.aClass2_Sub16_9 == null || Static314.aClass2_Sub16_9.aByteArray17.length < this.anInt6052 * 4) {
			Static314.aClass2_Sub16_9 = new Class2_Sub16(this.anInt6052 * 4);
		} else {
			Static314.aClass2_Sub16_9.anInt2789 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class2_Sub13 local68;
		@Pc(111) Class2_Sub16 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static116.aBoolean180) {
			for (local47 = 0; local47 < this.anInt6050; local47++) {
				local68 = arg0[this.anIntArray597[local47]][this.anIntArray600[local47]][this.anIntArray603[local47]];
				if (local68 != null && local68.aBoolean101) {
					local78 = this.anIntArrayArray47[local47];
					if (this.aBoolean401) {
						local86 = this.anIntArrayArray48[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static314.aClass2_Sub16_9.method2186(local86[local90]);
							}
						}
						local111 = this.aBooleanArray24[local47] ? Static314.aClass2_Sub16_9 : Static314.aClass2_Sub16_10;
					} else {
						local111 = Static314.aClass2_Sub16_10;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2186(local78[0]);
						local111.method2186(local78[local116]);
						local111.method2186(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt6050; local47++) {
				local68 = arg0[this.anIntArray597[local47]][this.anIntArray600[local47]][this.anIntArray603[local47]];
				if (local68 != null && local68.aBoolean101) {
					local78 = this.anIntArrayArray47[local47];
					if (this.aBoolean401) {
						local86 = this.anIntArrayArray48[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static314.aClass2_Sub16_9.method2181(local86[local90]);
							}
						}
						local111 = this.aBooleanArray24[local47] ? Static314.aClass2_Sub16_9 : Static314.aClass2_Sub16_10;
					} else {
						local111 = Static314.aClass2_Sub16_10;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2181(local78[0]);
						local111.method2181(local78[local116]);
						local111.method2181(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static314.aClass2_Sub16_10.anInt2789 == 0 && Static314.aClass2_Sub16_9.anInt2789 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static116.aGL1;
		if (this.anInt6048 == -1 || arg2) {
			Static116.method1945(-1);
			Static118.method1991(0, 0);
		} else {
			Static1.anInterface3_1.method4140(this.anInt6048);
		}
		@Pc(282) int local282 = this.aBoolean402 ? 40 : 36;
		if (this.aClass95_7 == null) {
			if (Static116.aBoolean186) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer14.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer14);
			this.aByteBuffer14.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer14);
			if (Static265.aBoolean348) {
				this.aByteBuffer14.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer14);
			}
			this.aByteBuffer14.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer14);
			if (this.aBoolean402) {
				local257.glClientActiveTexture(Static23.method452());
				this.aByteBuffer14.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer14);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass95_7.method2649();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static265.aBoolean348) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean402) {
				local257.glClientActiveTexture(Static23.method452());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static116.aBoolean186) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static314.aClass2_Sub16_10.anInt2789 != 0) {
			if (Static314.aByteBuffer13 == null || Static314.aByteBuffer13.capacity() < Static314.aClass2_Sub16_10.anInt2789) {
				Static314.aByteBuffer13 = ByteBuffer.allocateDirect(Static314.aClass2_Sub16_10.anInt2789).order(ByteOrder.nativeOrder());
			} else {
				Static314.aByteBuffer13.clear();
			}
			Static314.aByteBuffer13.put(Static314.aClass2_Sub16_10.aByteArray17, 0, Static314.aClass2_Sub16_10.anInt2789);
			Static314.aByteBuffer13.flip();
			Static116.method1957(arg1);
			local257.glDrawElements(4, Static314.aClass2_Sub16_10.anInt2789 / 4, 5125, Static314.aByteBuffer13);
		}
		if (Static314.aClass2_Sub16_9.anInt2789 == 0) {
			return;
		}
		if (Static314.aByteBuffer15 == null || Static314.aByteBuffer15.capacity() < Static314.aClass2_Sub16_9.anInt2789) {
			Static314.aByteBuffer15 = ByteBuffer.allocateDirect(Static314.aClass2_Sub16_9.anInt2789).order(ByteOrder.nativeOrder());
		} else {
			Static314.aByteBuffer15.clear();
		}
		Static314.aByteBuffer15.put(Static314.aClass2_Sub16_9.aByteArray17, 0, Static314.aClass2_Sub16_9.anInt2789);
		Static314.aByteBuffer15.flip();
		Static116.method1957(arg1 - 100.0F);
		Static116.method1947();
		local257.glDrawElements(4, Static314.aClass2_Sub16_9.anInt2789 / 4, 5125, Static314.aByteBuffer15);
		Static116.method1958();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIFFFIF)I")
	public int method4752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class2_Sub25 local28 = (Class2_Sub25) this.aClass101_28.method2867(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray598[local28.anInt4838]) {
					this.anIntArray598[local28.anInt4838] = arg1;
				}
				return local28.anInt4838;
			}
		}
		this.anIntArray599[this.anInt6047] = arg0;
		this.anIntArray598[this.anInt6047] = arg1;
		this.anIntArray602[this.anInt6047] = arg2;
		if (this.aBoolean402) {
			this.aFloatArray28[this.anInt6047] = arg7;
		}
		this.aFloatArray30[this.anInt6047] = arg3;
		this.aFloatArray29[this.anInt6047] = arg4;
		this.aFloatArray27[this.anInt6047] = arg5;
		this.anIntArray601[this.anInt6047] = arg6;
		if (local1 != 0L) {
			this.aClass101_28.method2860(new Class2_Sub25(this.anInt6047), local1);
		}
		return this.anInt6047++;
	}
}
