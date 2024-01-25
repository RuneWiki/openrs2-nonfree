import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class2_Sub22_Sub1 extends Class2_Sub22 {

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(I)V")
	public Class2_Sub22_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BF)V")
	public void method3701(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray115[super.anInt10247++] = (byte) local6;
		super.aByteArray115[super.anInt10247++] = (byte) (local6 >> 8);
		super.aByteArray115[super.anInt10247++] = (byte) (local6 >> 16);
		super.aByteArray115[super.anInt10247++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(FI)V")
	public void method3702(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray115[super.anInt10247++] = (byte) (local6 >> 24);
		super.aByteArray115[super.anInt10247++] = (byte) (local6 >> 16);
		super.aByteArray115[super.anInt10247++] = (byte) (local6 >> 8);
		super.aByteArray115[super.anInt10247++] = (byte) local6;
	}
}
