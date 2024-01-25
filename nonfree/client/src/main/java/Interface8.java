import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public interface Interface8 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[BI)V")
	void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!hf;)V")
	void method4973(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()I")
	int method4970();

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Lclient!hf;)V")
	void method4974(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(Lclient!hf;)V")
	void method4975(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(Lclient!hf;)V")
	void method4976(@OriginalArg(0) Class81 arg0);
}
