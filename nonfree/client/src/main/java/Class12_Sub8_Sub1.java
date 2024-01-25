import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class12_Sub8_Sub1 extends Class12_Sub8 {

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
	public Class12_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FI)V")
	public void method4923(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray82[super.anInt6217++] = (byte) (local6 >> 24);
		super.aByteArray82[super.anInt6217++] = (byte) (local6 >> 16);
		super.aByteArray82[super.anInt6217++] = (byte) (local6 >> 8);
		super.aByteArray82[super.anInt6217++] = (byte) local6;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BF)V")
	public void method4924(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray82[super.anInt6217++] = (byte) local6;
		super.aByteArray82[super.anInt6217++] = (byte) (local6 >> 8);
		super.aByteArray82[super.anInt6217++] = (byte) (local6 >> 16);
		super.aByteArray82[super.anInt6217++] = (byte) (local6 >> 24);
	}
}
