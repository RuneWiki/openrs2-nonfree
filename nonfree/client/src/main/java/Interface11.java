import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public interface Interface11 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	int method5181();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)I")
	int method5182();

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)J")
	long method5183();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII[B)V")
	void method5184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);
}
