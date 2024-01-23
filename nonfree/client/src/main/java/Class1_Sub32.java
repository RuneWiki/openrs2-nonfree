import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Lclient!hb;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "Lclient!ik;")
	private Class70 aClass70_18;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!tk", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "[Z")
	private boolean[] aBooleanArray47;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	public int anInt5037 = 0;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
	private int anInt5035 = 0;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
	private int anInt5039 = 0;

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
	public int anInt5040 = 0;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
	public int anInt5036 = 0;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
	private int anInt5041 = 0;

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
	public int anInt5042;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!tk", name = "F", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
	public int anInt5038;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt5042 = arg0;
		this.aFloat49 = arg1;
		this.aBoolean381 = arg2;
		this.aBoolean382 = arg3;
		this.anInt5038 = arg4;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "()V")
	public void method3945() {
		@Pc(12) Class1_Sub11 local12 = new Class1_Sub11((this.aBoolean382 ? 40 : 36) * this.anInt5037);
		for (@Pc(14) int local14 = 0; local14 < this.anInt5037; local14++) {
			if (Static277.aBoolean418) {
				local12.method2684((float) this.anIntArray453[local14]);
				local12.method2684((float) this.anIntArray449[local14]);
				local12.method2684((float) this.anIntArray452[local14]);
				local12.method2659(this.anIntArray447[local14]);
				local12.method2684(this.aFloatArray24[local14]);
				local12.method2684(this.aFloatArray26[local14]);
				local12.method2684(this.aFloatArray25[local14]);
				local12.method2684((float) this.anIntArray453[local14] / this.aFloat49);
				local12.method2684((float) this.anIntArray452[local14] / this.aFloat49);
				if (this.aBoolean382) {
					local12.method2684(this.aFloatArray23[local14]);
				}
			} else {
				local12.method2642((float) this.anIntArray453[local14]);
				local12.method2642((float) this.anIntArray449[local14]);
				local12.method2642((float) this.anIntArray452[local14]);
				local12.method2659(this.anIntArray447[local14]);
				local12.method2642(this.aFloatArray24[local14]);
				local12.method2642(this.aFloatArray26[local14]);
				local12.method2642(this.aFloatArray25[local14]);
				local12.method2642((float) this.anIntArray453[local14] / this.aFloat49);
				local12.method2642((float) this.anIntArray452[local14] / this.aFloat49);
				if (this.aBoolean382) {
					local12.method2642(this.aFloatArray23[local14]);
				}
			}
		}
		if (Static277.aBoolean417) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray47, 0, local12.anInt3264);
			this.aClass57_5 = new Class57();
			this.aClass57_5.method1739(local200);
		} else {
			this.aByteBuffer12 = ByteBuffer.allocateDirect(local12.anInt3264).order(ByteOrder.nativeOrder());
			this.aByteBuffer12.put(local12.aByteArray47, 0, local12.anInt3264);
			this.aByteBuffer12.flip();
		}
		this.anIntArray453 = null;
		this.anIntArray449 = null;
		this.anIntArray452 = null;
		this.anIntArray447 = null;
		this.aFloatArray24 = null;
		this.aFloatArray26 = null;
		this.aFloatArray25 = null;
		this.aClass70_18 = null;
		this.aFloatArray23 = null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([[[Lclient!pi;FZ)V")
	public void method3947(@OriginalArg(0) Class1_Sub26[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static257.aClass1_Sub11_7 == null || Static257.aClass1_Sub11_7.aByteArray47.length < this.anInt5039 * 4) {
			Static257.aClass1_Sub11_7 = new Class1_Sub11(this.anInt5039 * 4);
		} else {
			Static257.aClass1_Sub11_7.anInt3264 = 0;
		}
		if (Static257.aClass1_Sub11_6 == null || Static257.aClass1_Sub11_6.aByteArray47.length < this.anInt5041 * 4) {
			Static257.aClass1_Sub11_6 = new Class1_Sub11(this.anInt5041 * 4);
		} else {
			Static257.aClass1_Sub11_6.anInt3264 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub26 local68;
		@Pc(111) Class1_Sub11 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static277.aBoolean418) {
			for (local47 = 0; local47 < this.anInt5035; local47++) {
				local68 = arg0[this.anIntArray451[local47]][this.anIntArray450[local47]][this.anIntArray448[local47]];
				if (local68 != null && local68.aBoolean313) {
					local78 = this.anIntArrayArray33[local47];
					if (this.aBoolean381) {
						local86 = this.anIntArrayArray34[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static257.aClass1_Sub11_6.method2659(local86[local90]);
							}
						}
						local111 = this.aBooleanArray47[local47] ? Static257.aClass1_Sub11_6 : Static257.aClass1_Sub11_7;
					} else {
						local111 = Static257.aClass1_Sub11_7;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2659(local78[0]);
						local111.method2659(local78[local116]);
						local111.method2659(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt5035; local47++) {
				local68 = arg0[this.anIntArray451[local47]][this.anIntArray450[local47]][this.anIntArray448[local47]];
				if (local68 != null && local68.aBoolean313) {
					local78 = this.anIntArrayArray33[local47];
					if (this.aBoolean381) {
						local86 = this.anIntArrayArray34[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static257.aClass1_Sub11_6.method2626(local86[local90]);
							}
						}
						local111 = this.aBooleanArray47[local47] ? Static257.aClass1_Sub11_6 : Static257.aClass1_Sub11_7;
					} else {
						local111 = Static257.aClass1_Sub11_7;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2626(local78[0]);
						local111.method2626(local78[local116]);
						local111.method2626(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static257.aClass1_Sub11_7.anInt3264 == 0 && Static257.aClass1_Sub11_6.anInt3264 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static277.aGL1;
		if (this.anInt5042 == -1 || arg2) {
			Static277.method4212(-1);
			Static123.method2162(0, 0);
		} else {
			Static110.anInterface2_1.method2269(this.anInt5042);
		}
		@Pc(282) int local282 = this.aBoolean382 ? 40 : 36;
		if (this.aClass57_5 == null) {
			if (Static277.aBoolean417) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer12.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer12);
			this.aByteBuffer12.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer12);
			if (Static188.aBoolean295) {
				this.aByteBuffer12.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer12);
			}
			this.aByteBuffer12.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer12);
			if (this.aBoolean382) {
				local257.glClientActiveTexture(Static96.method1772());
				this.aByteBuffer12.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer12);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass57_5.method1740();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static188.aBoolean295) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean382) {
				local257.glClientActiveTexture(Static96.method1772());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static277.aBoolean417) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static257.aClass1_Sub11_7.anInt3264 != 0) {
			if (Static257.aByteBuffer10 == null || Static257.aByteBuffer10.capacity() < Static257.aClass1_Sub11_7.anInt3264) {
				Static257.aByteBuffer10 = ByteBuffer.allocateDirect(Static257.aClass1_Sub11_7.anInt3264).order(ByteOrder.nativeOrder());
			} else {
				Static257.aByteBuffer10.clear();
			}
			Static257.aByteBuffer10.put(Static257.aClass1_Sub11_7.aByteArray47, 0, Static257.aClass1_Sub11_7.anInt3264);
			Static257.aByteBuffer10.flip();
			Static277.method4221(arg1);
			local257.glDrawElements(4, Static257.aClass1_Sub11_7.anInt3264 / 4, 5125, Static257.aByteBuffer10);
		}
		if (Static257.aClass1_Sub11_6.anInt3264 == 0) {
			return;
		}
		if (Static257.aByteBuffer11 == null || Static257.aByteBuffer11.capacity() < Static257.aClass1_Sub11_6.anInt3264) {
			Static257.aByteBuffer11 = ByteBuffer.allocateDirect(Static257.aClass1_Sub11_6.anInt3264).order(ByteOrder.nativeOrder());
		} else {
			Static257.aByteBuffer11.clear();
		}
		Static257.aByteBuffer11.put(Static257.aClass1_Sub11_6.aByteArray47, 0, Static257.aClass1_Sub11_6.anInt3264);
		Static257.aByteBuffer11.flip();
		Static277.method4221(arg1 - 100.0F);
		Static277.method4208();
		local257.glDrawElements(4, Static257.aClass1_Sub11_6.anInt3264 / 4, 5125, Static257.aByteBuffer11);
		Static277.method4215();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[I[IZ)I")
	public int method3948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean381) {
			this.anIntArrayArray34[this.anInt5035] = arg4;
			this.aBooleanArray47[this.anInt5035] = arg5;
			if (arg4 != null) {
				this.anInt5041 += arg4.length;
			}
			if (arg5) {
				this.anInt5041 += (arg3.length - 2) * 3;
			} else {
				this.anInt5039 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt5039 += (arg3.length - 2) * 3;
		}
		this.anIntArray451[this.anInt5035] = arg0;
		this.anIntArray450[this.anInt5035] = arg1;
		this.anIntArray448[this.anInt5035] = arg2;
		this.anIntArrayArray33[this.anInt5035] = arg3;
		return this.anInt5035++;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()V")
	public void method3950() {
		this.anIntArray453 = new int[this.anInt5040];
		this.anIntArray449 = new int[this.anInt5040];
		this.anIntArray452 = new int[this.anInt5040];
		if (this.aBoolean382) {
			this.aFloatArray23 = new float[this.anInt5040];
		}
		this.anIntArray447 = new int[this.anInt5040];
		this.aFloatArray24 = new float[this.anInt5040];
		this.aFloatArray26 = new float[this.anInt5040];
		this.aFloatArray25 = new float[this.anInt5040];
		this.anIntArray450 = new int[this.anInt5036];
		this.anIntArray448 = new int[this.anInt5036];
		this.anIntArray451 = new int[this.anInt5036];
		this.anIntArrayArray33 = new int[this.anInt5036][];
		this.aClass70_18 = new Class70(Static161.method2789(this.anInt5040));
		if (this.aBoolean381) {
			this.anIntArrayArray34 = new int[this.anInt5036][];
			this.aBooleanArray47 = new boolean[this.anInt5036];
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIFFFIF)I")
	public int method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub29 local28 = (Class1_Sub29) this.aClass70_18.method2075(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray449[local28.anInt4792]) {
					this.anIntArray449[local28.anInt4792] = arg1;
				}
				return local28.anInt4792;
			}
		}
		this.anIntArray453[this.anInt5037] = arg0;
		this.anIntArray449[this.anInt5037] = arg1;
		this.anIntArray452[this.anInt5037] = arg2;
		if (this.aBoolean382) {
			this.aFloatArray23[this.anInt5037] = arg7;
		}
		this.aFloatArray24[this.anInt5037] = arg3;
		this.aFloatArray26[this.anInt5037] = arg4;
		this.aFloatArray25[this.anInt5037] = arg5;
		this.anIntArray447[this.anInt5037] = arg6;
		if (local1 != 0L) {
			this.aClass70_18.method2084(local1, new Class1_Sub29(this.anInt5037));
		}
		return this.anInt5037++;
	}
}
