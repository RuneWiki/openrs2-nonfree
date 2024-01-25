import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public interface Interface15 extends Interface16 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5275();

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)Z")
	boolean method5276();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z")
	boolean method5277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	void method7285();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method5278(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
