import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class8_Sub29 extends Class8 {

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer10;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "Lclient!l;")
	private Class98 aClass98_6;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "Lclient!pd;")
	private Class129 aClass129_28;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "I")
	private int anInt4983 = 0;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "I")
	private int anInt4982 = 0;

	@OriginalMember(owner = "client!td", name = "L", descriptor = "I")
	public int anInt4985 = 0;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public int anInt4980 = 0;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	public int anInt4986 = 0;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "I")
	private int anInt4987 = 0;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	public int anInt4984;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Z")
	public boolean aBoolean403;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public int anInt4981;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IFZZI)V")
	public Class8_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt4984 = arg0;
		this.aFloat57 = arg1;
		this.aBoolean403 = arg2;
		this.aBoolean402 = arg3;
		this.anInt4981 = arg4;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([[[Lclient!sg;FZ)V")
	public void method3781(@OriginalArg(0) Class8_Sub27[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static252.aClass8_Sub2_8 == null || Static252.aClass8_Sub2_8.aByteArray24.length < this.anInt4983 * 4) {
			Static252.aClass8_Sub2_8 = new Class8_Sub2(this.anInt4983 * 4);
		} else {
			Static252.aClass8_Sub2_8.anInt2955 = 0;
		}
		if (Static252.aClass8_Sub2_7 == null || Static252.aClass8_Sub2_7.aByteArray24.length < this.anInt4982 * 4) {
			Static252.aClass8_Sub2_7 = new Class8_Sub2(this.anInt4982 * 4);
		} else {
			Static252.aClass8_Sub2_7.anInt2955 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class8_Sub27 local68;
		@Pc(111) Class8_Sub2 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static116.aBoolean189) {
			for (local47 = 0; local47 < this.anInt4987; local47++) {
				local68 = arg0[this.anIntArray384[local47]][this.anIntArray380[local47]][this.anIntArray386[local47]];
				if (local68 != null && local68.aBoolean387) {
					local78 = this.anIntArrayArray34[local47];
					if (this.aBoolean403) {
						local86 = this.anIntArrayArray33[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static252.aClass8_Sub2_7.method2330(local86[local90]);
							}
						}
						local111 = this.aBooleanArray22[local47] ? Static252.aClass8_Sub2_7 : Static252.aClass8_Sub2_8;
					} else {
						local111 = Static252.aClass8_Sub2_8;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2330(local78[0]);
						local111.method2330(local78[local116]);
						local111.method2330(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt4987; local47++) {
				local68 = arg0[this.anIntArray384[local47]][this.anIntArray380[local47]][this.anIntArray386[local47]];
				if (local68 != null && local68.aBoolean387) {
					local78 = this.anIntArrayArray34[local47];
					if (this.aBoolean403) {
						local86 = this.anIntArrayArray33[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static252.aClass8_Sub2_7.method2332(local86[local90]);
							}
						}
						local111 = this.aBooleanArray22[local47] ? Static252.aClass8_Sub2_7 : Static252.aClass8_Sub2_8;
					} else {
						local111 = Static252.aClass8_Sub2_8;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2332(local78[0]);
						local111.method2332(local78[local116]);
						local111.method2332(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static252.aClass8_Sub2_8.anInt2955 == 0 && Static252.aClass8_Sub2_7.anInt2955 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static116.aGL1;
		if (this.anInt4984 == -1 || arg2) {
			Static116.method1897(-1);
			Static108.method1772(0, 0);
		} else {
			Static96.anInterface4_1.method1267(this.anInt4984);
		}
		@Pc(282) int local282 = this.aBoolean402 ? 40 : 36;
		if (this.aClass98_6 == null) {
			if (Static116.aBoolean195) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer10.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer10);
			this.aByteBuffer10.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer10);
			if (Static76.aBoolean117) {
				this.aByteBuffer10.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer10);
			}
			this.aByteBuffer10.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer10);
			if (this.aBoolean402) {
				local257.glClientActiveTexture(Static117.method1914());
				this.aByteBuffer10.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer10);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass98_6.method2260();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static76.aBoolean117) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean402) {
				local257.glClientActiveTexture(Static117.method1914());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static116.aBoolean195) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static252.aClass8_Sub2_8.anInt2955 != 0) {
			if (Static252.aByteBuffer12 == null || Static252.aByteBuffer12.capacity() < Static252.aClass8_Sub2_8.anInt2955) {
				Static252.aByteBuffer12 = ByteBuffer.allocateDirect(Static252.aClass8_Sub2_8.anInt2955).order(ByteOrder.nativeOrder());
			} else {
				Static252.aByteBuffer12.clear();
			}
			Static252.aByteBuffer12.put(Static252.aClass8_Sub2_8.aByteArray24, 0, Static252.aClass8_Sub2_8.anInt2955);
			Static252.aByteBuffer12.flip();
			Static116.method1868(arg1);
			local257.glDrawElements(4, Static252.aClass8_Sub2_8.anInt2955 / 4, 5125, Static252.aByteBuffer12);
		}
		if (Static252.aClass8_Sub2_7.anInt2955 == 0) {
			return;
		}
		if (Static252.aByteBuffer11 == null || Static252.aByteBuffer11.capacity() < Static252.aClass8_Sub2_7.anInt2955) {
			Static252.aByteBuffer11 = ByteBuffer.allocateDirect(Static252.aClass8_Sub2_7.anInt2955).order(ByteOrder.nativeOrder());
		} else {
			Static252.aByteBuffer11.clear();
		}
		Static252.aByteBuffer11.put(Static252.aClass8_Sub2_7.aByteArray24, 0, Static252.aClass8_Sub2_7.anInt2955);
		Static252.aByteBuffer11.flip();
		Static116.method1868(arg1 - 100.0F);
		Static116.method1874();
		local257.glDrawElements(4, Static252.aClass8_Sub2_7.anInt2955 / 4, 5125, Static252.aByteBuffer11);
		Static116.method1881();
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
	public void method3783() {
		this.anIntArray383 = new int[this.anInt4980];
		this.anIntArray382 = new int[this.anInt4980];
		this.anIntArray381 = new int[this.anInt4980];
		if (this.aBoolean402) {
			this.aFloatArray27 = new float[this.anInt4980];
		}
		this.anIntArray385 = new int[this.anInt4980];
		this.aFloatArray25 = new float[this.anInt4980];
		this.aFloatArray24 = new float[this.anInt4980];
		this.aFloatArray26 = new float[this.anInt4980];
		this.anIntArray380 = new int[this.anInt4986];
		this.anIntArray386 = new int[this.anInt4986];
		this.anIntArray384 = new int[this.anInt4986];
		this.anIntArrayArray34 = new int[this.anInt4986][];
		this.aClass129_28 = new Class129(Static95.method1518(this.anInt4980));
		if (this.aBoolean403) {
			this.anIntArrayArray33 = new int[this.anInt4986][];
			this.aBooleanArray22 = new boolean[this.anInt4986];
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III[I[IZ)I")
	public int method3784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean403) {
			this.anIntArrayArray33[this.anInt4987] = arg4;
			this.aBooleanArray22[this.anInt4987] = arg5;
			if (arg4 != null) {
				this.anInt4982 += arg4.length;
			}
			if (arg5) {
				this.anInt4982 += (arg3.length - 2) * 3;
			} else {
				this.anInt4983 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt4983 += (arg3.length - 2) * 3;
		}
		this.anIntArray384[this.anInt4987] = arg0;
		this.anIntArray380[this.anInt4987] = arg1;
		this.anIntArray386[this.anInt4987] = arg2;
		this.anIntArrayArray34[this.anInt4987] = arg3;
		return this.anInt4987++;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIFFFIF)I")
	public int method3785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class8_Sub28 local28 = (Class8_Sub28) this.aClass129_28.method3043(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray382[local28.anInt4870]) {
					this.anIntArray382[local28.anInt4870] = arg1;
				}
				return local28.anInt4870;
			}
		}
		this.anIntArray383[this.anInt4985] = arg0;
		this.anIntArray382[this.anInt4985] = arg1;
		this.anIntArray381[this.anInt4985] = arg2;
		if (this.aBoolean402) {
			this.aFloatArray27[this.anInt4985] = arg7;
		}
		this.aFloatArray25[this.anInt4985] = arg3;
		this.aFloatArray24[this.anInt4985] = arg4;
		this.aFloatArray26[this.anInt4985] = arg5;
		this.anIntArray385[this.anInt4985] = arg6;
		if (local1 != 0L) {
			this.aClass129_28.method3039(new Class8_Sub28(this.anInt4985), local1);
		}
		return this.anInt4985++;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	public void method3786() {
		@Pc(12) Class8_Sub2 local12 = new Class8_Sub2((this.aBoolean402 ? 40 : 36) * this.anInt4985);
		for (@Pc(14) int local14 = 0; local14 < this.anInt4985; local14++) {
			if (Static116.aBoolean189) {
				local12.method2383((float) this.anIntArray383[local14]);
				local12.method2383((float) this.anIntArray382[local14]);
				local12.method2383((float) this.anIntArray381[local14]);
				local12.method2330(this.anIntArray385[local14]);
				local12.method2383(this.aFloatArray25[local14]);
				local12.method2383(this.aFloatArray24[local14]);
				local12.method2383(this.aFloatArray26[local14]);
				local12.method2383((float) this.anIntArray383[local14] / this.aFloat57);
				local12.method2383((float) this.anIntArray381[local14] / this.aFloat57);
				if (this.aBoolean402) {
					local12.method2383(this.aFloatArray27[local14]);
				}
			} else {
				local12.method2324((float) this.anIntArray383[local14]);
				local12.method2324((float) this.anIntArray382[local14]);
				local12.method2324((float) this.anIntArray381[local14]);
				local12.method2330(this.anIntArray385[local14]);
				local12.method2324(this.aFloatArray25[local14]);
				local12.method2324(this.aFloatArray24[local14]);
				local12.method2324(this.aFloatArray26[local14]);
				local12.method2324((float) this.anIntArray383[local14] / this.aFloat57);
				local12.method2324((float) this.anIntArray381[local14] / this.aFloat57);
				if (this.aBoolean402) {
					local12.method2324(this.aFloatArray27[local14]);
				}
			}
		}
		if (Static116.aBoolean195) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray24, 0, local12.anInt2955);
			this.aClass98_6 = new Class98();
			this.aClass98_6.method2263(local200);
		} else {
			this.aByteBuffer10 = ByteBuffer.allocateDirect(local12.anInt2955).order(ByteOrder.nativeOrder());
			this.aByteBuffer10.put(local12.aByteArray24, 0, local12.anInt2955);
			this.aByteBuffer10.flip();
		}
		this.anIntArray383 = null;
		this.anIntArray382 = null;
		this.anIntArray381 = null;
		this.anIntArray385 = null;
		this.aFloatArray25 = null;
		this.aFloatArray24 = null;
		this.aFloatArray26 = null;
		this.aClass129_28 = null;
		this.aFloatArray27 = null;
	}
}
