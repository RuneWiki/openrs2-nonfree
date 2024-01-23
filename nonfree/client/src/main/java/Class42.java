import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class42 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!an;")
	private Class12 aClass12_5;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!an;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	private int anInt1320 = -1;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	private int anInt1319;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class42() {
		@Pc(9) GL local9 = Static156.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt1319 = local12[0];
		Static10.anInt141 += 16384;
		Static156.method2699(this.anInt1319);
		local9.glTexParameteri(3553, 10241, 9729);
		local9.glTexParameteri(3553, 10240, 9729);
		local9.glTexParameteri(3553, 10242, 33071);
		local9.glTexParameteri(3553, 10243, 33071);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()V")
	public void method1236() {
		@Pc(1) GL local1 = Static156.aGL1;
		Static156.method2699(this.anInt1319);
		if (this.aClass12_5 == null) {
			if (Static156.aBoolean206) {
				local1.glBindBufferARB(34962, 0);
			}
			local1.glInterleavedArrays(10791, 20, this.aByteBuffer9);
			Static156.aBoolean209 = false;
		} else {
			this.aClass12_5.method179();
			local1.glInterleavedArrays(10791, 20, 0L);
			Static156.aBoolean209 = false;
		}
		if (this.aClass12_6 == null) {
			if (Static156.aBoolean206) {
				local1.glBindBufferARB(34963, 0);
			}
			local1.glDrawElements(4, 384, 5125, this.aByteBuffer8);
		} else {
			this.aClass12_6.method181();
			local1.glDrawElements(4, 384, 5125, 0L);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([[III)V")
	public void method1237(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static156.aBoolean212) {
					local4.method1388((float) local11 / 8.0F);
					local4.method1388((float) local6 / 8.0F);
					local4.method1388((float) (local11 * 128));
					local4.method1388((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method1388((float) (local6 * 128));
				} else {
					local4.method1395((float) local11 / 8.0F);
					local4.method1395((float) local6 / 8.0F);
					local4.method1395((float) (local11 * 128));
					local4.method1395((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method1395((float) (local6 * 128));
				}
			}
		}
		if (Static156.aBoolean206) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray17, 0, local4.anInt1480);
			this.aClass12_5 = new Class12();
			this.aClass12_5.method178(local112);
		} else {
			this.aByteBuffer9 = ByteBuffer.allocateDirect(local4.anInt1480).order(ByteOrder.nativeOrder());
			this.aByteBuffer9.put(local4.aByteArray17, 0, local4.anInt1480);
			this.aByteBuffer9.flip();
		}
		@Pc(147) Class1_Sub14 local147 = new Class1_Sub14(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static156.aBoolean212) {
					local147.method1387(local154 + (local11 + 1) * 9);
					local147.method1387(local154 + local11 * 9);
					local147.method1387(local154 + local11 * 9 + 1);
					local147.method1387(local154 + (local11 + 1) * 9);
					local147.method1387(local154 + local11 * 9 + 1);
					local147.method1387(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method1347(local154 + (local11 + 1) * 9);
					local147.method1347(local154 + local11 * 9);
					local147.method1347(local154 + local11 * 9 + 1);
					local147.method1347(local154 + (local11 + 1) * 9);
					local147.method1347(local154 + local11 * 9 + 1);
					local147.method1347(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static156.aBoolean206) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray17, 0, local147.anInt1480);
			this.aClass12_6 = new Class12();
			this.aClass12_6.method182(local293);
		} else {
			this.aByteBuffer8 = ByteBuffer.allocateDirect(local147.anInt1480).order(ByteOrder.nativeOrder());
			this.aByteBuffer8.put(local147.aByteArray17, 0, local147.anInt1480);
			this.aByteBuffer8.flip();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!fe;II)Z")
	public boolean method1238(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray18;
		@Pc(5) int local5 = arg0.anInt4473;
		@Pc(19) int local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23;
		@Pc(33) int local33;
		for (local23 = -128; local23 < 0; local23++) {
			local21 = (local21 << 8) - local21;
			for (local33 = -128; local33 < 0; local33++) {
				if (local2[local19++] != 0) {
					local21++;
				}
			}
			local19 += local5 - 128;
		}
		if (local21 == this.anInt1320) {
			return false;
		}
		this.anInt1320 = local21;
		local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		local23 = 0;
		for (local33 = -128; local33 < 0; local33++) {
			for (@Pc(82) int local82 = -128; local82 < 0; local82++) {
				if (local2[local19] == 0) {
					@Pc(96) int local96 = 0;
					if (local2[local19 - 1] != 0) {
						local96++;
					}
					if (local2[local19 + 1] != 0) {
						local96++;
					}
					if (local2[local19 - local5] != 0) {
						local96++;
					}
					if (local2[local19 + local5] != 0) {
						local96++;
					}
					Static67.aByteArray15[local23++] = (byte) (local96 * 17);
				} else {
					Static67.aByteArray15[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static156.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static67.aByteArray15);
		local148.limit(16384);
		Static156.method2699(this.anInt1319);
		local145.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, local148);
		return true;
	}
}
