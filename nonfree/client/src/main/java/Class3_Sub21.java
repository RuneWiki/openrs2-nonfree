import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[F")
	private float[] aFloatArray11;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "[Z")
	private boolean[] aBooleanArray83;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "[F")
	private float[] aFloatArray12;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "Lclient!ib;")
	private Class76 aClass76_4;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "Lclient!cn;")
	private Class30 aClass30_19;

	@OriginalMember(owner = "client!mi", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "[F")
	private float[] aFloatArray13;

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "[F")
	private float[] aFloatArray14;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	private int anInt3237 = 0;

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
	public int anInt3243 = 0;

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
	public int anInt3241 = 0;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
	private int anInt3240 = 0;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
	public int anInt3239 = 0;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
	private int anInt3244 = 0;

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
	public int anInt3242;

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "F")
	private float aFloat47;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "Z")
	public boolean aBoolean233;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public int anInt3238;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IFZZI)V")
	public Class3_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt3242 = arg0;
		this.aFloat47 = arg1;
		this.aBoolean233 = arg2;
		this.aBoolean232 = arg3;
		this.anInt3238 = arg4;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIFFFIF)I")
	public int method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class3_Sub8 local28 = (Class3_Sub8) this.aClass30_19.method663(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray390[local28.anInt1237]) {
					this.anIntArray390[local28.anInt1237] = arg1;
				}
				return local28.anInt1237;
			}
		}
		this.anIntArray395[this.anInt3239] = arg0;
		this.anIntArray390[this.anInt3239] = arg1;
		this.anIntArray389[this.anInt3239] = arg2;
		if (this.aBoolean232) {
			this.aFloatArray11[this.anInt3239] = arg7;
		}
		this.aFloatArray14[this.anInt3239] = arg3;
		this.aFloatArray13[this.anInt3239] = arg4;
		this.aFloatArray12[this.anInt3239] = arg5;
		this.anIntArray394[this.anInt3239] = arg6;
		if (local1 != 0L) {
			this.aClass30_19.method668(new Class3_Sub8(this.anInt3239), local1);
		}
		return this.anInt3239++;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
	public void method2857() {
		this.anIntArray395 = new int[this.anInt3241];
		this.anIntArray390 = new int[this.anInt3241];
		this.anIntArray389 = new int[this.anInt3241];
		if (this.aBoolean232) {
			this.aFloatArray11 = new float[this.anInt3241];
		}
		this.anIntArray394 = new int[this.anInt3241];
		this.aFloatArray14 = new float[this.anInt3241];
		this.aFloatArray13 = new float[this.anInt3241];
		this.aFloatArray12 = new float[this.anInt3241];
		this.anIntArray393 = new int[this.anInt3243];
		this.anIntArray391 = new int[this.anInt3243];
		this.anIntArray392 = new int[this.anInt3243];
		this.anIntArrayArray53 = new int[this.anInt3243][];
		this.aClass30_19 = new Class30(Static165.method2731(this.anInt3241));
		if (this.aBoolean233) {
			this.anIntArrayArray52 = new int[this.anInt3243][];
			this.aBooleanArray83 = new boolean[this.anInt3243];
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()V")
	public void method2858() {
		@Pc(12) Class3_Sub26 local12 = new Class3_Sub26((this.aBoolean232 ? 40 : 36) * this.anInt3239);
		for (@Pc(14) int local14 = 0; local14 < this.anInt3239; local14++) {
			if (Static283.aBoolean403) {
				local12.method3933((float) this.anIntArray395[local14]);
				local12.method3933((float) this.anIntArray390[local14]);
				local12.method3933((float) this.anIntArray389[local14]);
				local12.method3944(this.anIntArray394[local14]);
				local12.method3933(this.aFloatArray14[local14]);
				local12.method3933(this.aFloatArray13[local14]);
				local12.method3933(this.aFloatArray12[local14]);
				local12.method3933((float) this.anIntArray395[local14] / this.aFloat47);
				local12.method3933((float) this.anIntArray389[local14] / this.aFloat47);
				if (this.aBoolean232) {
					local12.method3933(this.aFloatArray11[local14]);
				}
			} else {
				local12.method3934((float) this.anIntArray395[local14]);
				local12.method3934((float) this.anIntArray390[local14]);
				local12.method3934((float) this.anIntArray389[local14]);
				local12.method3944(this.anIntArray394[local14]);
				local12.method3934(this.aFloatArray14[local14]);
				local12.method3934(this.aFloatArray13[local14]);
				local12.method3934(this.aFloatArray12[local14]);
				local12.method3934((float) this.anIntArray395[local14] / this.aFloat47);
				local12.method3934((float) this.anIntArray389[local14] / this.aFloat47);
				if (this.aBoolean232) {
					local12.method3934(this.aFloatArray11[local14]);
				}
			}
		}
		if (Static283.aBoolean406) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray64, 0, local12.anInt4615);
			this.aClass76_4 = new Class76();
			this.aClass76_4.method1830(local200);
		} else {
			this.aByteBuffer8 = ByteBuffer.allocateDirect(local12.anInt4615).order(ByteOrder.nativeOrder());
			this.aByteBuffer8.put(local12.aByteArray64, 0, local12.anInt4615);
			this.aByteBuffer8.flip();
		}
		this.anIntArray395 = null;
		this.anIntArray390 = null;
		this.anIntArray389 = null;
		this.anIntArray394 = null;
		this.aFloatArray14 = null;
		this.aFloatArray13 = null;
		this.aFloatArray12 = null;
		this.aClass30_19 = null;
		this.aFloatArray11 = null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([[[Lclient!qo;FZ)V")
	public void method2859(@OriginalArg(0) Class3_Sub25[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static172.aClass3_Sub26_4 == null || Static172.aClass3_Sub26_4.aByteArray64.length < this.anInt3237 * 4) {
			Static172.aClass3_Sub26_4 = new Class3_Sub26(this.anInt3237 * 4);
		} else {
			Static172.aClass3_Sub26_4.anInt4615 = 0;
		}
		if (Static172.aClass3_Sub26_3 == null || Static172.aClass3_Sub26_3.aByteArray64.length < this.anInt3244 * 4) {
			Static172.aClass3_Sub26_3 = new Class3_Sub26(this.anInt3244 * 4);
		} else {
			Static172.aClass3_Sub26_3.anInt4615 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class3_Sub25 local68;
		@Pc(111) Class3_Sub26 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static283.aBoolean403) {
			for (local47 = 0; local47 < this.anInt3240; local47++) {
				local68 = arg0[this.anIntArray392[local47]][this.anIntArray393[local47]][this.anIntArray391[local47]];
				if (local68 != null && local68.aBoolean317) {
					local78 = this.anIntArrayArray53[local47];
					if (this.aBoolean233) {
						local86 = this.anIntArrayArray52[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static172.aClass3_Sub26_3.method3944(local86[local90]);
							}
						}
						local111 = this.aBooleanArray83[local47] ? Static172.aClass3_Sub26_3 : Static172.aClass3_Sub26_4;
					} else {
						local111 = Static172.aClass3_Sub26_4;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method3944(local78[0]);
						local111.method3944(local78[local116]);
						local111.method3944(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt3240; local47++) {
				local68 = arg0[this.anIntArray392[local47]][this.anIntArray393[local47]][this.anIntArray391[local47]];
				if (local68 != null && local68.aBoolean317) {
					local78 = this.anIntArrayArray53[local47];
					if (this.aBoolean233) {
						local86 = this.anIntArrayArray52[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static172.aClass3_Sub26_3.method3922(local86[local90]);
							}
						}
						local111 = this.aBooleanArray83[local47] ? Static172.aClass3_Sub26_3 : Static172.aClass3_Sub26_4;
					} else {
						local111 = Static172.aClass3_Sub26_4;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method3922(local78[0]);
						local111.method3922(local78[local116]);
						local111.method3922(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static172.aClass3_Sub26_4.anInt4615 == 0 && Static172.aClass3_Sub26_3.anInt4615 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static283.aGL1;
		if (this.anInt3242 == -1 || arg2) {
			Static283.method4636(-1);
			Static53.method5036(0, 0);
		} else {
			Static16.anInterface4_1.method2902(this.anInt3242);
		}
		@Pc(282) int local282 = this.aBoolean232 ? 40 : 36;
		if (this.aClass76_4 == null) {
			if (Static283.aBoolean406) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer8.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer8);
			this.aByteBuffer8.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer8);
			if (Static67.aBoolean95) {
				this.aByteBuffer8.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer8);
			}
			this.aByteBuffer8.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer8);
			if (this.aBoolean232) {
				local257.glClientActiveTexture(Static74.method1131());
				this.aByteBuffer8.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer8);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass76_4.method1829();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static67.aBoolean95) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean232) {
				local257.glClientActiveTexture(Static74.method1131());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static283.aBoolean406) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static172.aClass3_Sub26_4.anInt4615 != 0) {
			if (Static172.aByteBuffer9 == null || Static172.aByteBuffer9.capacity() < Static172.aClass3_Sub26_4.anInt4615) {
				Static172.aByteBuffer9 = ByteBuffer.allocateDirect(Static172.aClass3_Sub26_4.anInt4615).order(ByteOrder.nativeOrder());
			} else {
				Static172.aByteBuffer9.clear();
			}
			Static172.aByteBuffer9.put(Static172.aClass3_Sub26_4.aByteArray64, 0, Static172.aClass3_Sub26_4.anInt4615);
			Static172.aByteBuffer9.flip();
			Static283.method4634(arg1);
			local257.glDrawElements(4, Static172.aClass3_Sub26_4.anInt4615 / 4, 5125, Static172.aByteBuffer9);
		}
		if (Static172.aClass3_Sub26_3.anInt4615 == 0) {
			return;
		}
		if (Static172.aByteBuffer10 == null || Static172.aByteBuffer10.capacity() < Static172.aClass3_Sub26_3.anInt4615) {
			Static172.aByteBuffer10 = ByteBuffer.allocateDirect(Static172.aClass3_Sub26_3.anInt4615).order(ByteOrder.nativeOrder());
		} else {
			Static172.aByteBuffer10.clear();
		}
		Static172.aByteBuffer10.put(Static172.aClass3_Sub26_3.aByteArray64, 0, Static172.aClass3_Sub26_3.anInt4615);
		Static172.aByteBuffer10.flip();
		Static283.method4634(arg1 - 100.0F);
		Static283.method4641();
		local257.glDrawElements(4, Static172.aClass3_Sub26_3.anInt4615 / 4, 5125, Static172.aByteBuffer10);
		Static283.method4653();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[I[IZ)I")
	public int method2860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean233) {
			this.anIntArrayArray52[this.anInt3240] = arg4;
			this.aBooleanArray83[this.anInt3240] = arg5;
			if (arg4 != null) {
				this.anInt3244 += arg4.length;
			}
			if (arg5) {
				this.anInt3244 += (arg3.length - 2) * 3;
			} else {
				this.anInt3237 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt3237 += (arg3.length - 2) * 3;
		}
		this.anIntArray392[this.anInt3240] = arg0;
		this.anIntArray393[this.anInt3240] = arg1;
		this.anIntArray391[this.anInt3240] = arg2;
		this.anIntArrayArray53[this.anInt3240] = arg3;
		return this.anInt3240++;
	}
}
