import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class2_Sub8_Sub23 extends Class2_Sub8 {

	@OriginalMember(owner = "client!vk", name = "C", descriptor = "Lclient!l;")
	private Class101 aClass101_24;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)I")
	public int method4572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass101_24 == null) {
			return arg0;
		} else {
			@Pc(24) Class2_Sub25 local24 = (Class2_Sub25) this.aClass101_24.method2867((long) arg1);
			return local24 == null ? arg0 : local24.anInt4838;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method4573(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method4579(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4574(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass101_24 == null) {
			return arg0;
		} else {
			@Pc(23) Class2_Sub17 local23 = (Class2_Sub17) this.aClass101_24.method2867((long) arg1);
			return local23 == null ? arg0 : local23.aString98;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!oe;BI)V")
	private void method4579(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(17) int local17 = arg0.method2146();
		@Pc(24) int local24;
		if (this.aClass101_24 == null) {
			local24 = Static305.method4628(local17);
			this.aClass101_24 = new Class101(local24);
		}
		for (local24 = 0; local24 < local17; local24++) {
			@Pc(48) boolean local48 = arg0.method2146() == 1;
			@Pc(52) int local52 = arg0.method2166();
			@Pc(61) Class2 local61;
			if (local48) {
				local61 = new Class2_Sub17(arg0.method2158());
			} else {
				local61 = new Class2_Sub25(arg0.method2145());
			}
			this.aClass101_24.method2860(local61, (long) local52);
		}
	}
}
