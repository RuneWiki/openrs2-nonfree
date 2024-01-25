import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public interface Interface5 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "()I")
	int method5385();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	void method5080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[BI)V")
	void method5081(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
