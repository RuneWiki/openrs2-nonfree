import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "Lclient!tm;")
	private Class163 aClass163_8;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "[F")
	private float[] aFloatArray9;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "Lclient!me;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "[F")
	private float[] aFloatArray11;

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "[F")
	private float[] aFloatArray12;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public int anInt582 = 0;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
	private int anInt588 = 0;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	public int anInt587 = 0;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
	private int anInt584 = 0;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
	public int anInt585 = 0;

	@OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
	private int anInt589 = 0;

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "Z")
	public boolean aBoolean45;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IFZZI)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt586 = arg0;
		this.aFloat20 = arg1;
		this.aBoolean45 = arg2;
		this.aBoolean44 = arg3;
		this.anInt583 = arg4;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	public void method570() {
		@Pc(12) Class4_Sub24 local12 = new Class4_Sub24((this.aBoolean44 ? 40 : 36) * this.anInt587);
		for (@Pc(14) int local14 = 0; local14 < this.anInt587; local14++) {
			if (Static251.aBoolean314) {
				local12.method3099((float) this.anIntArray73[local14]);
				local12.method3099((float) this.anIntArray75[local14]);
				local12.method3099((float) this.anIntArray78[local14]);
				local12.method3066(this.anIntArray76[local14]);
				local12.method3099(this.aFloatArray10[local14]);
				local12.method3099(this.aFloatArray12[local14]);
				local12.method3099(this.aFloatArray11[local14]);
				local12.method3099((float) this.anIntArray73[local14] / this.aFloat20);
				local12.method3099((float) this.anIntArray78[local14] / this.aFloat20);
				if (this.aBoolean44) {
					local12.method3099(this.aFloatArray9[local14]);
				}
			} else {
				local12.method3087((float) this.anIntArray73[local14]);
				local12.method3087((float) this.anIntArray75[local14]);
				local12.method3087((float) this.anIntArray78[local14]);
				local12.method3066(this.anIntArray76[local14]);
				local12.method3087(this.aFloatArray10[local14]);
				local12.method3087(this.aFloatArray12[local14]);
				local12.method3087(this.aFloatArray11[local14]);
				local12.method3087((float) this.anIntArray73[local14] / this.aFloat20);
				local12.method3087((float) this.anIntArray78[local14] / this.aFloat20);
				if (this.aBoolean44) {
					local12.method3087(this.aFloatArray9[local14]);
				}
			}
		}
		if (Static251.aBoolean327) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray47, 0, local12.anInt3822);
			this.aClass107_1 = new Class107();
			this.aClass107_1.method2632(local200);
		} else {
			this.aByteBuffer3 = ByteBuffer.allocateDirect(local12.anInt3822).order(ByteOrder.nativeOrder());
			this.aByteBuffer3.put(local12.aByteArray47, 0, local12.anInt3822);
			this.aByteBuffer3.flip();
		}
		this.anIntArray73 = null;
		this.anIntArray75 = null;
		this.anIntArray78 = null;
		this.anIntArray76 = null;
		this.aFloatArray10 = null;
		this.aFloatArray12 = null;
		this.aFloatArray11 = null;
		this.aClass163_8 = null;
		this.aFloatArray9 = null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIFFFIF)I")
	public int method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class4_Sub25 local28 = (Class4_Sub25) this.aClass163_8.method4188(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray75[local28.anInt3892]) {
					this.anIntArray75[local28.anInt3892] = arg1;
				}
				return local28.anInt3892;
			}
		}
		this.anIntArray73[this.anInt587] = arg0;
		this.anIntArray75[this.anInt587] = arg1;
		this.anIntArray78[this.anInt587] = arg2;
		if (this.aBoolean44) {
			this.aFloatArray9[this.anInt587] = arg7;
		}
		this.aFloatArray10[this.anInt587] = arg3;
		this.aFloatArray12[this.anInt587] = arg4;
		this.aFloatArray11[this.anInt587] = arg5;
		this.anIntArray76[this.anInt587] = arg6;
		if (local1 != 0L) {
			this.aClass163_8.method4181(local1, new Class4_Sub25(this.anInt587));
		}
		return this.anInt587++;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	public void method572() {
		this.anIntArray73 = new int[this.anInt585];
		this.anIntArray75 = new int[this.anInt585];
		this.anIntArray78 = new int[this.anInt585];
		if (this.aBoolean44) {
			this.aFloatArray9 = new float[this.anInt585];
		}
		this.anIntArray76 = new int[this.anInt585];
		this.aFloatArray10 = new float[this.anInt585];
		this.aFloatArray12 = new float[this.anInt585];
		this.aFloatArray11 = new float[this.anInt585];
		this.anIntArray77 = new int[this.anInt582];
		this.anIntArray74 = new int[this.anInt582];
		this.anIntArray72 = new int[this.anInt582];
		this.anIntArrayArray7 = new int[this.anInt582][];
		this.aClass163_8 = new Class163(Static308.method4715(this.anInt585));
		if (this.aBoolean45) {
			this.anIntArrayArray8 = new int[this.anInt582][];
			this.aBooleanArray12 = new boolean[this.anInt582];
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[I[IZ)I")
	public int method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean45) {
			this.anIntArrayArray8[this.anInt588] = arg4;
			this.aBooleanArray12[this.anInt588] = arg5;
			if (arg4 != null) {
				this.anInt589 += arg4.length;
			}
			if (arg5) {
				this.anInt589 += (arg3.length - 2) * 3;
			} else {
				this.anInt584 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt584 += (arg3.length - 2) * 3;
		}
		this.anIntArray72[this.anInt588] = arg0;
		this.anIntArray77[this.anInt588] = arg1;
		this.anIntArray74[this.anInt588] = arg2;
		this.anIntArrayArray7[this.anInt588] = arg3;
		return this.anInt588++;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([[[Lclient!k;FZ)V")
	public void method575(@OriginalArg(0) Class4_Sub21[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static26.aClass4_Sub24_5 == null || Static26.aClass4_Sub24_5.aByteArray47.length < this.anInt584 * 4) {
			Static26.aClass4_Sub24_5 = new Class4_Sub24(this.anInt584 * 4);
		} else {
			Static26.aClass4_Sub24_5.anInt3822 = 0;
		}
		if (Static26.aClass4_Sub24_6 == null || Static26.aClass4_Sub24_6.aByteArray47.length < this.anInt589 * 4) {
			Static26.aClass4_Sub24_6 = new Class4_Sub24(this.anInt589 * 4);
		} else {
			Static26.aClass4_Sub24_6.anInt3822 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class4_Sub21 local68;
		@Pc(111) Class4_Sub24 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static251.aBoolean314) {
			for (local47 = 0; local47 < this.anInt588; local47++) {
				local68 = arg0[this.anIntArray72[local47]][this.anIntArray77[local47]][this.anIntArray74[local47]];
				if (local68 != null && local68.aBoolean172) {
					local78 = this.anIntArrayArray7[local47];
					if (this.aBoolean45) {
						local86 = this.anIntArrayArray8[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static26.aClass4_Sub24_6.method3066(local86[local90]);
							}
						}
						local111 = this.aBooleanArray12[local47] ? Static26.aClass4_Sub24_6 : Static26.aClass4_Sub24_5;
					} else {
						local111 = Static26.aClass4_Sub24_5;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method3066(local78[0]);
						local111.method3066(local78[local116]);
						local111.method3066(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt588; local47++) {
				local68 = arg0[this.anIntArray72[local47]][this.anIntArray77[local47]][this.anIntArray74[local47]];
				if (local68 != null && local68.aBoolean172) {
					local78 = this.anIntArrayArray7[local47];
					if (this.aBoolean45) {
						local86 = this.anIntArrayArray8[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static26.aClass4_Sub24_6.method3103(local86[local90]);
							}
						}
						local111 = this.aBooleanArray12[local47] ? Static26.aClass4_Sub24_6 : Static26.aClass4_Sub24_5;
					} else {
						local111 = Static26.aClass4_Sub24_5;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method3103(local78[0]);
						local111.method3103(local78[local116]);
						local111.method3103(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static26.aClass4_Sub24_5.anInt3822 == 0 && Static26.aClass4_Sub24_6.anInt3822 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static251.aGL1;
		if (this.anInt586 == -1 || arg2) {
			Static251.method3892(-1);
			Static126.method2046(0, 0);
		} else {
			Static283.anInterface1_1.method2436(this.anInt586);
		}
		@Pc(282) int local282 = this.aBoolean44 ? 40 : 36;
		if (this.aClass107_1 == null) {
			if (Static251.aBoolean327) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer3.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer3);
			this.aByteBuffer3.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer3);
			if (Static253.aBoolean335) {
				this.aByteBuffer3.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer3);
			}
			this.aByteBuffer3.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer3);
			if (this.aBoolean44) {
				local257.glClientActiveTexture(Static227.method3581());
				this.aByteBuffer3.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer3);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass107_1.method2633();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static253.aBoolean335) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean44) {
				local257.glClientActiveTexture(Static227.method3581());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static251.aBoolean327) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static26.aClass4_Sub24_5.anInt3822 != 0) {
			if (Static26.aByteBuffer4 == null || Static26.aByteBuffer4.capacity() < Static26.aClass4_Sub24_5.anInt3822) {
				Static26.aByteBuffer4 = ByteBuffer.allocateDirect(Static26.aClass4_Sub24_5.anInt3822).order(ByteOrder.nativeOrder());
			} else {
				Static26.aByteBuffer4.clear();
			}
			Static26.aByteBuffer4.put(Static26.aClass4_Sub24_5.aByteArray47, 0, Static26.aClass4_Sub24_5.anInt3822);
			Static26.aByteBuffer4.flip();
			Static251.method3861(arg1);
			local257.glDrawElements(4, Static26.aClass4_Sub24_5.anInt3822 / 4, 5125, Static26.aByteBuffer4);
		}
		if (Static26.aClass4_Sub24_6.anInt3822 == 0) {
			return;
		}
		if (Static26.aByteBuffer5 == null || Static26.aByteBuffer5.capacity() < Static26.aClass4_Sub24_6.anInt3822) {
			Static26.aByteBuffer5 = ByteBuffer.allocateDirect(Static26.aClass4_Sub24_6.anInt3822).order(ByteOrder.nativeOrder());
		} else {
			Static26.aByteBuffer5.clear();
		}
		Static26.aByteBuffer5.put(Static26.aClass4_Sub24_6.aByteArray47, 0, Static26.aClass4_Sub24_6.anInt3822);
		Static26.aByteBuffer5.flip();
		Static251.method3861(arg1 - 100.0F);
		Static251.method3856();
		local257.glDrawElements(4, Static26.aClass4_Sub24_6.anInt3822 / 4, 5125, Static26.aByteBuffer5);
		Static251.method3878();
	}
}
