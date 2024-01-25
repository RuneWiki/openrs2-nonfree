import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public interface Interface6 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
	int method5379();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pa;)V")
	void method5381(@OriginalArg(0) Class161 arg0);

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!pa;)V")
	void method5382(@OriginalArg(0) Class161 arg0);

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Lclient!pa;)V")
	void method5383(@OriginalArg(0) Class161 arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BI)V")
	void method5384(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Lclient!pa;)V")
	void method5385(@OriginalArg(0) Class161 arg0);
}
