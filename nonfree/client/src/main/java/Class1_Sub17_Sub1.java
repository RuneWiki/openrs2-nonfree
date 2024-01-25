import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class1_Sub17_Sub1 extends Class1_Sub17 {

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IF)V")
	public void method3095(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray58[super.anInt4872++] = (byte) local6;
		super.aByteArray58[super.anInt4872++] = (byte) (local6 >> 8);
		super.aByteArray58[super.anInt4872++] = (byte) (local6 >> 16);
		super.aByteArray58[super.anInt4872++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IF)V")
	public void method3096(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray58[super.anInt4872++] = (byte) (local6 >> 24);
		super.aByteArray58[super.anInt4872++] = (byte) (local6 >> 16);
		super.aByteArray58[super.anInt4872++] = (byte) (local6 >> 8);
		super.aByteArray58[super.anInt4872++] = (byte) local6;
	}
}
