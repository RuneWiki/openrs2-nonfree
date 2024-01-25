import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IF)V")
	public void method2643(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray46[super.anInt3235++] = (byte) local6;
		super.aByteArray46[super.anInt3235++] = (byte) (local6 >> 8);
		super.aByteArray46[super.anInt3235++] = (byte) (local6 >> 16);
		super.aByteArray46[super.anInt3235++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FI)V")
	public void method2645(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray46[super.anInt3235++] = (byte) (local11 >> 24);
		super.aByteArray46[super.anInt3235++] = (byte) (local11 >> 16);
		super.aByteArray46[super.anInt3235++] = (byte) (local11 >> 8);
		super.aByteArray46[super.anInt3235++] = (byte) local11;
	}
}
