import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!ch;")
	private Class30 aClass30_6;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "[F")
	private float[] aFloatArray21;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "Lclient!s;")
	private Class156 aClass156_17;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "[Z")
	private boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
	private int anInt3736 = 0;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
	private int anInt3740 = 0;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
	public int anInt3739 = 0;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
	private int anInt3738 = 0;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	public int anInt3737 = 0;

	@OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
	public int anInt3742 = 0;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	public int anInt3735;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Z")
	public boolean aBoolean259;

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "Z")
	private boolean aBoolean260;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
	public int anInt3741;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt3735 = arg0;
		this.aFloat40 = arg1;
		this.aBoolean259 = arg2;
		this.aBoolean260 = arg3;
		this.anInt3741 = arg4;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([[[Lclient!mc;FZ)V")
	public void method3044(@OriginalArg(0) Class1_Sub17[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static186.aClass1_Sub14_7 == null || Static186.aClass1_Sub14_7.aByteArray34.length < this.anInt3740 * 4) {
			Static186.aClass1_Sub14_7 = new Class1_Sub14(this.anInt3740 * 4);
		} else {
			Static186.aClass1_Sub14_7.anInt3290 = 0;
		}
		if (Static186.aClass1_Sub14_8 == null || Static186.aClass1_Sub14_8.aByteArray34.length < this.anInt3738 * 4) {
			Static186.aClass1_Sub14_8 = new Class1_Sub14(this.anInt3738 * 4);
		} else {
			Static186.aClass1_Sub14_8.anInt3290 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub17 local68;
		@Pc(111) Class1_Sub14 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static291.aBoolean413) {
			for (local47 = 0; local47 < this.anInt3736; local47++) {
				local68 = arg0[this.anIntArray308[local47]][this.anIntArray307[local47]][this.anIntArray310[local47]];
				if (local68 != null && local68.aBoolean239) {
					local78 = this.anIntArrayArray26[local47];
					if (this.aBoolean259) {
						local86 = this.anIntArrayArray27[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static186.aClass1_Sub14_8.method2630(local86[local90]);
							}
						}
						local111 = this.aBooleanArray39[local47] ? Static186.aClass1_Sub14_8 : Static186.aClass1_Sub14_7;
					} else {
						local111 = Static186.aClass1_Sub14_7;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2630(local78[0]);
						local111.method2630(local78[local116]);
						local111.method2630(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt3736; local47++) {
				local68 = arg0[this.anIntArray308[local47]][this.anIntArray307[local47]][this.anIntArray310[local47]];
				if (local68 != null && local68.aBoolean239) {
					local78 = this.anIntArrayArray26[local47];
					if (this.aBoolean259) {
						local86 = this.anIntArrayArray27[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static186.aClass1_Sub14_8.method2611(local86[local90]);
							}
						}
						local111 = this.aBooleanArray39[local47] ? Static186.aClass1_Sub14_8 : Static186.aClass1_Sub14_7;
					} else {
						local111 = Static186.aClass1_Sub14_7;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2611(local78[0]);
						local111.method2611(local78[local116]);
						local111.method2611(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static186.aClass1_Sub14_7.anInt3290 == 0 && Static186.aClass1_Sub14_8.anInt3290 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static291.aGL1;
		if (this.anInt3735 == -1 || arg2) {
			Static291.method4310(-1);
			Static207.method3280(0, 0);
		} else {
			Static18.anInterface1_1.method1630(this.anInt3735);
		}
		@Pc(282) int local282 = this.aBoolean260 ? 40 : 36;
		if (this.aClass30_6 == null) {
			if (Static291.aBoolean405) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer12.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer12);
			this.aByteBuffer12.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer12);
			if (Static302.aBoolean419) {
				this.aByteBuffer12.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer12);
			}
			this.aByteBuffer12.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer12);
			if (this.aBoolean260) {
				local257.glClientActiveTexture(Static126.method2013());
				this.aByteBuffer12.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer12);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass30_6.method541();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static302.aBoolean419) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean260) {
				local257.glClientActiveTexture(Static126.method2013());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static291.aBoolean405) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static186.aClass1_Sub14_7.anInt3290 != 0) {
			if (Static186.aByteBuffer13 == null || Static186.aByteBuffer13.capacity() < Static186.aClass1_Sub14_7.anInt3290) {
				Static186.aByteBuffer13 = ByteBuffer.allocateDirect(Static186.aClass1_Sub14_7.anInt3290).order(ByteOrder.nativeOrder());
			} else {
				Static186.aByteBuffer13.clear();
			}
			Static186.aByteBuffer13.put(Static186.aClass1_Sub14_7.aByteArray34, 0, Static186.aClass1_Sub14_7.anInt3290);
			Static186.aByteBuffer13.flip();
			Static291.method4299(arg1);
			local257.glDrawElements(4, Static186.aClass1_Sub14_7.anInt3290 / 4, 5125, Static186.aByteBuffer13);
		}
		if (Static186.aClass1_Sub14_8.anInt3290 == 0) {
			return;
		}
		if (Static186.aByteBuffer14 == null || Static186.aByteBuffer14.capacity() < Static186.aClass1_Sub14_8.anInt3290) {
			Static186.aByteBuffer14 = ByteBuffer.allocateDirect(Static186.aClass1_Sub14_8.anInt3290).order(ByteOrder.nativeOrder());
		} else {
			Static186.aByteBuffer14.clear();
		}
		Static186.aByteBuffer14.put(Static186.aClass1_Sub14_8.aByteArray34, 0, Static186.aClass1_Sub14_8.anInt3290);
		Static186.aByteBuffer14.flip();
		Static291.method4299(arg1 - 100.0F);
		Static291.method4330();
		local257.glDrawElements(4, Static186.aClass1_Sub14_8.anInt3290 / 4, 5125, Static186.aByteBuffer14);
		Static291.method4333();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[I[IZ)I")
	public int method3046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean259) {
			this.anIntArrayArray27[this.anInt3736] = arg4;
			this.aBooleanArray39[this.anInt3736] = arg5;
			if (arg4 != null) {
				this.anInt3738 += arg4.length;
			}
			if (arg5) {
				this.anInt3738 += (arg3.length - 2) * 3;
			} else {
				this.anInt3740 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt3740 += (arg3.length - 2) * 3;
		}
		this.anIntArray308[this.anInt3736] = arg0;
		this.anIntArray307[this.anInt3736] = arg1;
		this.anIntArray310[this.anInt3736] = arg2;
		this.anIntArrayArray26[this.anInt3736] = arg3;
		return this.anInt3736++;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
	public void method3047() {
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14((this.aBoolean260 ? 40 : 36) * this.anInt3739);
		for (@Pc(14) int local14 = 0; local14 < this.anInt3739; local14++) {
			if (Static291.aBoolean413) {
				local12.method2604((float) this.anIntArray306[local14]);
				local12.method2604((float) this.anIntArray309[local14]);
				local12.method2604((float) this.anIntArray304[local14]);
				local12.method2630(this.anIntArray305[local14]);
				local12.method2604(this.aFloatArray23[local14]);
				local12.method2604(this.aFloatArray22[local14]);
				local12.method2604(this.aFloatArray21[local14]);
				local12.method2604((float) this.anIntArray306[local14] / this.aFloat40);
				local12.method2604((float) this.anIntArray304[local14] / this.aFloat40);
				if (this.aBoolean260) {
					local12.method2604(this.aFloatArray24[local14]);
				}
			} else {
				local12.method2594((float) this.anIntArray306[local14]);
				local12.method2594((float) this.anIntArray309[local14]);
				local12.method2594((float) this.anIntArray304[local14]);
				local12.method2630(this.anIntArray305[local14]);
				local12.method2594(this.aFloatArray23[local14]);
				local12.method2594(this.aFloatArray22[local14]);
				local12.method2594(this.aFloatArray21[local14]);
				local12.method2594((float) this.anIntArray306[local14] / this.aFloat40);
				local12.method2594((float) this.anIntArray304[local14] / this.aFloat40);
				if (this.aBoolean260) {
					local12.method2594(this.aFloatArray24[local14]);
				}
			}
		}
		if (Static291.aBoolean405) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray34, 0, local12.anInt3290);
			this.aClass30_6 = new Class30();
			this.aClass30_6.method544(local200);
		} else {
			this.aByteBuffer12 = ByteBuffer.allocateDirect(local12.anInt3290).order(ByteOrder.nativeOrder());
			this.aByteBuffer12.put(local12.aByteArray34, 0, local12.anInt3290);
			this.aByteBuffer12.flip();
		}
		this.anIntArray306 = null;
		this.anIntArray309 = null;
		this.anIntArray304 = null;
		this.anIntArray305 = null;
		this.aFloatArray23 = null;
		this.aFloatArray22 = null;
		this.aFloatArray21 = null;
		this.aClass156_17 = null;
		this.aFloatArray24 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIFFFIF)I")
	public int method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub13 local28 = (Class1_Sub13) this.aClass156_17.method3821(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray309[local28.anInt2852]) {
					this.anIntArray309[local28.anInt2852] = arg1;
				}
				return local28.anInt2852;
			}
		}
		this.anIntArray306[this.anInt3739] = arg0;
		this.anIntArray309[this.anInt3739] = arg1;
		this.anIntArray304[this.anInt3739] = arg2;
		if (this.aBoolean260) {
			this.aFloatArray24[this.anInt3739] = arg7;
		}
		this.aFloatArray23[this.anInt3739] = arg3;
		this.aFloatArray22[this.anInt3739] = arg4;
		this.aFloatArray21[this.anInt3739] = arg5;
		this.anIntArray305[this.anInt3739] = arg6;
		if (local1 != 0L) {
			this.aClass156_17.method3816(local1, new Class1_Sub13(this.anInt3739));
		}
		return this.anInt3739++;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "()V")
	public void method3050() {
		this.anIntArray306 = new int[this.anInt3742];
		this.anIntArray309 = new int[this.anInt3742];
		this.anIntArray304 = new int[this.anInt3742];
		if (this.aBoolean260) {
			this.aFloatArray24 = new float[this.anInt3742];
		}
		this.anIntArray305 = new int[this.anInt3742];
		this.aFloatArray23 = new float[this.anInt3742];
		this.aFloatArray22 = new float[this.anInt3742];
		this.aFloatArray21 = new float[this.anInt3742];
		this.anIntArray307 = new int[this.anInt3737];
		this.anIntArray310 = new int[this.anInt3737];
		this.anIntArray308 = new int[this.anInt3737];
		this.anIntArrayArray26 = new int[this.anInt3737][];
		this.aClass156_17 = new Class156(Static203.method3254(this.anInt3742));
		if (this.aBoolean259) {
			this.anIntArrayArray27 = new int[this.anInt3737][];
			this.aBooleanArray39 = new boolean[this.anInt3737];
		}
	}
}
