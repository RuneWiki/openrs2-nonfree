import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class3_Sub11_Sub2 extends Class3_Sub11 {

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(FI)V")
	public void method3142(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray36[super.anInt3520++] = (byte) (local6 >> 24);
		super.aByteArray36[super.anInt3520++] = (byte) (local6 >> 16);
		super.aByteArray36[super.anInt3520++] = (byte) (local6 >> 8);
		super.aByteArray36[super.anInt3520++] = (byte) local6;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IF)V")
	public void method3143(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray36[super.anInt3520++] = (byte) local6;
		super.aByteArray36[super.anInt3520++] = (byte) (local6 >> 8);
		super.aByteArray36[super.anInt3520++] = (byte) (local6 >> 16);
		super.aByteArray36[super.anInt3520++] = (byte) (local6 >> 24);
	}
}
