import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!ol;")
	private Class117 aClass117_9;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "[F")
	private float[] aFloatArray17;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "[F")
	private float[] aFloatArray18;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Lclient!rl;")
	private Class141 aClass141_3;

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	private int anInt3095 = 0;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	public int anInt3096 = 0;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	public int anInt3100 = 0;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public int anInt3097 = 0;

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
	private int anInt3102 = 0;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
	private int anInt3099 = 0;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "F")
	private float aFloat105;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "Z")
	public boolean aBoolean160;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Z")
	private boolean aBoolean159;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
	public int anInt3098;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IFZZI)V")
	public Class1_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt3101 = arg0;
		this.aFloat105 = arg1;
		this.aBoolean160 = arg2;
		this.aBoolean159 = arg3;
		this.anInt3098 = arg4;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	public void method2358() {
		@Pc(12) Class1_Sub16 local12 = new Class1_Sub16((this.aBoolean159 ? 40 : 36) * this.anInt3096);
		for (@Pc(14) int local14 = 0; local14 < this.anInt3096; local14++) {
			if (Static296.aBoolean344) {
				local12.method2601((float) this.anIntArray279[local14]);
				local12.method2601((float) this.anIntArray283[local14]);
				local12.method2601((float) this.anIntArray282[local14]);
				local12.method2606(this.anIntArray277[local14]);
				local12.method2601(this.aFloatArray20[local14]);
				local12.method2601(this.aFloatArray19[local14]);
				local12.method2601(this.aFloatArray18[local14]);
				local12.method2601((float) this.anIntArray279[local14] / this.aFloat105);
				local12.method2601((float) this.anIntArray282[local14] / this.aFloat105);
				if (this.aBoolean159) {
					local12.method2601(this.aFloatArray17[local14]);
				}
			} else {
				local12.method2629((float) this.anIntArray279[local14]);
				local12.method2629((float) this.anIntArray283[local14]);
				local12.method2629((float) this.anIntArray282[local14]);
				local12.method2606(this.anIntArray277[local14]);
				local12.method2629(this.aFloatArray20[local14]);
				local12.method2629(this.aFloatArray19[local14]);
				local12.method2629(this.aFloatArray18[local14]);
				local12.method2629((float) this.anIntArray279[local14] / this.aFloat105);
				local12.method2629((float) this.anIntArray282[local14] / this.aFloat105);
				if (this.aBoolean159) {
					local12.method2629(this.aFloatArray17[local14]);
				}
			}
		}
		if (Static296.aBoolean347) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray39, 0, local12.anInt3328);
			this.aClass141_3 = new Class141();
			this.aClass141_3.method4041(local200);
		} else {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local12.anInt3328).order(ByteOrder.nativeOrder());
			this.aByteBuffer6.put(local12.aByteArray39, 0, local12.anInt3328);
			this.aByteBuffer6.flip();
		}
		this.anIntArray279 = null;
		this.anIntArray283 = null;
		this.anIntArray282 = null;
		this.anIntArray277 = null;
		this.aFloatArray20 = null;
		this.aFloatArray19 = null;
		this.aFloatArray18 = null;
		this.aClass117_9 = null;
		this.aFloatArray17 = null;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()V")
	public void method2361() {
		this.anIntArray279 = new int[this.anInt3097];
		this.anIntArray283 = new int[this.anInt3097];
		this.anIntArray282 = new int[this.anInt3097];
		if (this.aBoolean159) {
			this.aFloatArray17 = new float[this.anInt3097];
		}
		this.anIntArray277 = new int[this.anInt3097];
		this.aFloatArray20 = new float[this.anInt3097];
		this.aFloatArray19 = new float[this.anInt3097];
		this.aFloatArray18 = new float[this.anInt3097];
		this.anIntArray281 = new int[this.anInt3100];
		this.anIntArray278 = new int[this.anInt3100];
		this.anIntArray280 = new int[this.anInt3100];
		this.anIntArrayArray19 = new int[this.anInt3100][];
		this.aClass117_9 = new Class117(Static227.method3943(this.anInt3097));
		if (this.aBoolean160) {
			this.anIntArrayArray20 = new int[this.anInt3100][];
			this.aBooleanArray12 = new boolean[this.anInt3100];
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[I[IZ)I")
	public int method2362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean160) {
			this.anIntArrayArray20[this.anInt3099] = arg4;
			this.aBooleanArray12[this.anInt3099] = arg5;
			if (arg4 != null) {
				this.anInt3102 += arg4.length;
			}
			if (arg5) {
				this.anInt3102 += (arg3.length - 2) * 3;
			} else {
				this.anInt3095 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt3095 += (arg3.length - 2) * 3;
		}
		this.anIntArray280[this.anInt3099] = arg0;
		this.anIntArray281[this.anInt3099] = arg1;
		this.anIntArray278[this.anInt3099] = arg2;
		this.anIntArrayArray19[this.anInt3099] = arg3;
		return this.anInt3099++;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIFFFIF)I")
	public int method2363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class1_Sub10 local28 = (Class1_Sub10) this.aClass117_9.method3438(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray283[local28.anInt1508]) {
					this.anIntArray283[local28.anInt1508] = arg1;
				}
				return local28.anInt1508;
			}
		}
		this.anIntArray279[this.anInt3096] = arg0;
		this.anIntArray283[this.anInt3096] = arg1;
		this.anIntArray282[this.anInt3096] = arg2;
		if (this.aBoolean159) {
			this.aFloatArray17[this.anInt3096] = arg7;
		}
		this.aFloatArray20[this.anInt3096] = arg3;
		this.aFloatArray19[this.anInt3096] = arg4;
		this.aFloatArray18[this.anInt3096] = arg5;
		this.anIntArray277[this.anInt3096] = arg6;
		if (local1 != 0L) {
			this.aClass117_9.method3445(new Class1_Sub10(this.anInt3096), local1);
		}
		return this.anInt3096++;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([[[Lclient!i;FZ)V")
	public void method2364(@OriginalArg(0) Class1_Sub14[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static137.aClass1_Sub16_9 == null || Static137.aClass1_Sub16_9.aByteArray39.length < this.anInt3095 * 4) {
			Static137.aClass1_Sub16_9 = new Class1_Sub16(this.anInt3095 * 4);
		} else {
			Static137.aClass1_Sub16_9.anInt3328 = 0;
		}
		if (Static137.aClass1_Sub16_8 == null || Static137.aClass1_Sub16_8.aByteArray39.length < this.anInt3102 * 4) {
			Static137.aClass1_Sub16_8 = new Class1_Sub16(this.anInt3102 * 4);
		} else {
			Static137.aClass1_Sub16_8.anInt3328 = 0;
		}
		@Pc(47) int local47;
		@Pc(68) Class1_Sub14 local68;
		@Pc(111) Class1_Sub16 local111;
		@Pc(78) int[] local78;
		@Pc(86) int[] local86;
		@Pc(90) int local90;
		@Pc(116) int local116;
		if (Static296.aBoolean344) {
			for (local47 = 0; local47 < this.anInt3099; local47++) {
				local68 = arg0[this.anIntArray280[local47]][this.anIntArray281[local47]][this.anIntArray278[local47]];
				if (local68 != null && local68.aBoolean126) {
					local78 = this.anIntArrayArray19[local47];
					if (this.aBoolean160) {
						local86 = this.anIntArrayArray20[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static137.aClass1_Sub16_8.method2606(local86[local90]);
							}
						}
						local111 = this.aBooleanArray12[local47] ? Static137.aClass1_Sub16_8 : Static137.aClass1_Sub16_9;
					} else {
						local111 = Static137.aClass1_Sub16_9;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2606(local78[0]);
						local111.method2606(local78[local116]);
						local111.method2606(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt3099; local47++) {
				local68 = arg0[this.anIntArray280[local47]][this.anIntArray281[local47]][this.anIntArray278[local47]];
				if (local68 != null && local68.aBoolean126) {
					local78 = this.anIntArrayArray19[local47];
					if (this.aBoolean160) {
						local86 = this.anIntArrayArray20[local47];
						if (local86 != null) {
							for (local90 = 0; local90 < local86.length; local90++) {
								Static137.aClass1_Sub16_8.method2656(local86[local90]);
							}
						}
						local111 = this.aBooleanArray12[local47] ? Static137.aClass1_Sub16_8 : Static137.aClass1_Sub16_9;
					} else {
						local111 = Static137.aClass1_Sub16_9;
					}
					for (local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method2656(local78[0]);
						local111.method2656(local78[local116]);
						local111.method2656(local78[local116 + 1]);
					}
				}
			}
		}
		if (Static137.aClass1_Sub16_9.anInt3328 == 0 && Static137.aClass1_Sub16_8.anInt3328 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static296.aGL1;
		if (this.anInt3101 == -1 || arg2) {
			Static296.method4812(-1);
			Static141.method2524(0, 0);
		} else {
			Static151.anInterface2_1.method4421(this.anInt3101);
		}
		@Pc(282) int local282 = this.aBoolean159 ? 40 : 36;
		if (this.aClass141_3 == null) {
			if (Static296.aBoolean347) {
				local257.glBindBufferARB(34962, 0);
			}
			this.aByteBuffer6.position(0);
			local257.glVertexPointer(3, 5126, local282, this.aByteBuffer6);
			this.aByteBuffer6.position(12);
			local257.glColorPointer(4, 5121, local282, this.aByteBuffer6);
			if (Static10.aBoolean12) {
				this.aByteBuffer6.position(16);
				local257.glNormalPointer(5126, local282, this.aByteBuffer6);
			}
			this.aByteBuffer6.position(28);
			local257.glTexCoordPointer(2, 5126, local282, this.aByteBuffer6);
			if (this.aBoolean159) {
				local257.glClientActiveTexture(Static198.method3562());
				this.aByteBuffer6.position(36);
				local257.glTexCoordPointer(1, 5126, local282, this.aByteBuffer6);
				local257.glClientActiveTexture(33984);
			}
		} else {
			this.aClass141_3.method4040();
			local257.glVertexPointer(3, 5126, local282, 0L);
			local257.glColorPointer(4, 5121, local282, 12L);
			if (Static10.aBoolean12) {
				local257.glNormalPointer(5126, local282, 16L);
			}
			local257.glTexCoordPointer(2, 5126, local282, 28L);
			if (this.aBoolean159) {
				local257.glClientActiveTexture(Static198.method3562());
				local257.glTexCoordPointer(1, 5126, local282, 36L);
				local257.glClientActiveTexture(33984);
			}
		}
		if (Static296.aBoolean347) {
			local257.glBindBufferARB(34963, 0);
		}
		if (Static137.aClass1_Sub16_9.anInt3328 != 0) {
			if (Static137.aByteBuffer8 == null || Static137.aByteBuffer8.capacity() < Static137.aClass1_Sub16_9.anInt3328) {
				Static137.aByteBuffer8 = ByteBuffer.allocateDirect(Static137.aClass1_Sub16_9.anInt3328).order(ByteOrder.nativeOrder());
			} else {
				Static137.aByteBuffer8.clear();
			}
			Static137.aByteBuffer8.put(Static137.aClass1_Sub16_9.aByteArray39, 0, Static137.aClass1_Sub16_9.anInt3328);
			Static137.aByteBuffer8.flip();
			Static296.method4806(arg1);
			local257.glDrawElements(4, Static137.aClass1_Sub16_9.anInt3328 / 4, 5125, Static137.aByteBuffer8);
		}
		if (Static137.aClass1_Sub16_8.anInt3328 == 0) {
			return;
		}
		if (Static137.aByteBuffer7 == null || Static137.aByteBuffer7.capacity() < Static137.aClass1_Sub16_8.anInt3328) {
			Static137.aByteBuffer7 = ByteBuffer.allocateDirect(Static137.aClass1_Sub16_8.anInt3328).order(ByteOrder.nativeOrder());
		} else {
			Static137.aByteBuffer7.clear();
		}
		Static137.aByteBuffer7.put(Static137.aClass1_Sub16_8.aByteArray39, 0, Static137.aClass1_Sub16_8.anInt3328);
		Static137.aByteBuffer7.flip();
		Static296.method4806(arg1 - 100.0F);
		Static296.method4808();
		local257.glDrawElements(4, Static137.aClass1_Sub16_8.anInt3328 / 4, 5125, Static137.aByteBuffer7);
		Static296.method4813();
	}
}
