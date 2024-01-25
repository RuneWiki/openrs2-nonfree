import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub35_Sub1 extends Class1_Sub35 {

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub35_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZF)V")
	public void method5571(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray85[super.anInt7214++] = (byte) (local11 >> 24);
		super.aByteArray85[super.anInt7214++] = (byte) (local11 >> 16);
		super.aByteArray85[super.anInt7214++] = (byte) (local11 >> 8);
		super.aByteArray85[super.anInt7214++] = (byte) local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BF)V")
	public void method5572(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray85[super.anInt7214++] = (byte) local11;
		super.aByteArray85[super.anInt7214++] = (byte) (local11 >> 8);
		super.aByteArray85[super.anInt7214++] = (byte) (local11 >> 16);
		super.aByteArray85[super.anInt7214++] = (byte) (local11 >> 24);
	}
}
