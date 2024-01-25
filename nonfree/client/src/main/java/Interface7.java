import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public interface Interface7 extends Interface19 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method5840();

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)Z")
	boolean method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	void method5842();

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)Z")
	boolean method5843();

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIZ)Z")
	boolean method5844(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
