import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface Interface5 extends Interface9 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	void method9248(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	void method9249();

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
	boolean method9250();

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Lclient!ns;")
	Class261 method9251();

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method9252();
}
