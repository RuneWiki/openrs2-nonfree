import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public interface Interface9 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()I")
	int method4193();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!gm;)V")
	void method4194(@OriginalArg(0) Class84 arg0);

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Lclient!gm;)V")
	void method4195(@OriginalArg(0) Class84 arg0);

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Lclient!gm;)V")
	void method4196(@OriginalArg(0) Class84 arg0);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Lclient!gm;)V")
	void method4197(@OriginalArg(0) Class84 arg0);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[BI)V")
	void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
