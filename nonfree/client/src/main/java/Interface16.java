import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public interface Interface16 extends Interface15 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7456();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Z")
	boolean method7457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
	boolean method7458();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	void method7459();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method7460(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
