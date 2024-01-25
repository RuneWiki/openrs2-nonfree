import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public interface Interface16 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	void method8267();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!fw;)V")
	void method8268(@OriginalArg(1) Class110 arg0);
}
