import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class7_Sub14_Sub2 extends Class7_Sub14 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class7_Sub14_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BF)V")
	public void method3994(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray75[super.anInt4989++] = (byte) local6;
		super.aByteArray75[super.anInt4989++] = (byte) (local6 >> 8);
		super.aByteArray75[super.anInt4989++] = (byte) (local6 >> 16);
		super.aByteArray75[super.anInt4989++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(FI)V")
	public void method3996(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray75[super.anInt4989++] = (byte) (local6 >> 24);
		super.aByteArray75[super.anInt4989++] = (byte) (local6 >> 16);
		super.aByteArray75[super.anInt4989++] = (byte) (local6 >> 8);
		super.aByteArray75[super.anInt4989++] = (byte) local6;
	}
}
