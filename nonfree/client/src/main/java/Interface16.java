import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public interface Interface16 extends Interface4 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	void method5772();

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	boolean method5773(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Z")
	boolean method5774();

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method5775();

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)Z")
	boolean method5776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
